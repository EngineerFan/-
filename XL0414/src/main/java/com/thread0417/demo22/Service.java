package com.thread0417.demo22;

import java.util.concurrent.locks.ReentrantLock;

public class Service {

	private ReentrantLock lock;
	public Service(boolean isFair) {
		lock = new ReentrantLock(isFair);
	}
	
	
	public void serviceMethod(){
		try {
			lock.lock();
			System.out.println("ThreadName="+Thread.currentThread().getName()+" 获得锁定");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
}
