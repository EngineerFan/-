package com.thread0417.demo28;

import java.util.concurrent.locks.ReentrantLock;

public class Service {

	private ReentrantLock lock;
	public Service(boolean isFair) {
		lock = new ReentrantLock(isFair);
	}
	
	public void serviceMethod(){
		try {
			lock.lock();
			System.out.println("公平锁情况："+lock.isFair());
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			lock.unlock();
		}
	}
}
