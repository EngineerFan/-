package com.thread0417.demo30;

import java.util.concurrent.locks.ReentrantLock;

public class Service {

	private ReentrantLock lock;
	
	public Service(boolean isFair) {
		lock = new ReentrantLock(isFair);
	}
	
	public void serviceMethod(){
		try {
			System.out.println(lock.isLocked());
			lock.lock();
			System.out.println(lock.isLocked());
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			lock.unlock();
		}
	}
}
