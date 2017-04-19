package com.thread0417.demo29;

import java.util.concurrent.locks.ReentrantLock;

public class Service {

	private ReentrantLock lock;
	
	public Service(boolean isFair) {
		lock = new ReentrantLock(isFair);
	}
	
	public void serviceMethod(){
		try {
			System.out.println(lock.isHeldByCurrentThread());
			lock.lock();
			System.out.println(lock.isHeldByCurrentThread());
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			lock.unlock();
		}
	}
}
