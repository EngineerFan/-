package com.thread0417.demo34;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {

	private ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	public void testMethod(){
		try {
			lock.lock();
			System.out.println("wait begin");
			condition.awaitUninterruptibly();
			System.out.println("wait   end");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("catch");
		}finally {
			lock.unlock();
		}
	}
}
