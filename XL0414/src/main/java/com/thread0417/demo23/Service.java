package com.thread0417.demo23;

import java.util.concurrent.locks.ReentrantLock;

public class Service {

	private ReentrantLock lock = new ReentrantLock();
	
	
	public void serviceMethod1(){
		try {
			lock.lock();
			System.out.println("serviceMethod1 getHoldCount="+lock.getHoldCount());
			serviceMethod2();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	
	public void serviceMethod2(){
		try {
			lock.lock();
			System.out.println("serviceMethod2 getHoldCount="+lock.getHoldCount());
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			lock.unlock();
		}
	}
}
