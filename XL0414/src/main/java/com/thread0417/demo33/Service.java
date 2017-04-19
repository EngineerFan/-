package com.thread0417.demo33;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Service {

	public ReentrantLock lock = new ReentrantLock();
	
	public void waitMethod(){
		try {
			if(lock.tryLock(3,TimeUnit.SECONDS)){
				System.out.println("    "+Thread.currentThread().getName()+" 获得锁的时间："+System.currentTimeMillis());
				Thread.sleep(10000);
			}else{
				System.out.println("    "+Thread.currentThread().getName()+" 没有获得锁");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(lock.isHeldByCurrentThread()){
				System.out.println(Thread.currentThread().getName()+" 释放锁了！");
				lock.unlock();
			}
		}
	}
}
