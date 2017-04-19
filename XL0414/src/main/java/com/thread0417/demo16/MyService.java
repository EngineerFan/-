package com.thread0417.demo16;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	private Lock lock = new ReentrantLock();
	
	private Condition condition =lock.newCondition();
	
	public void await(){
		try {
			condition.await();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void waitMethod(){
		try {
			lock.lock();
			System.out.println("AA");
			condition.await();
			System.out.println("B");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			lock.unlock();
			System.out.println("锁释放了！");
		}
	}
}
