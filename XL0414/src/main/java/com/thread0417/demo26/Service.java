package com.thread0417.demo26;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {

	public ReentrantLock lock = new ReentrantLock();
	public Condition newCondition = lock.newCondition();
	
	public void waitMethod(){
		try {
			lock.lock();
			Thread.sleep(Integer.MAX_VALUE);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			lock.unlock();
		}
	}
}
