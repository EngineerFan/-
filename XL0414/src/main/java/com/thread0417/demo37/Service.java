package com.thread0417.demo37;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {

	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	
	public void read(){
		try {
			lock.readLock().lock();
			System.out.println("获取读锁 "+Thread.currentThread().getName()+" "+System.currentTimeMillis());
			Thread.sleep(10000);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			lock.readLock().unlock();
		}
	}
}
