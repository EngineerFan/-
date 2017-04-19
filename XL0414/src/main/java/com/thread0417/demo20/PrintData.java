package com.thread0417.demo20;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintData {

	private Lock lock =new ReentrantLock();
	public Condition condition = lock.newCondition();
	volatile private boolean state =false;
	public void printA(){
		try {
			lock.lock();
			while(state==true){
				condition.await();
			}
			System.out.println("print A");
			state=true;
			condition.signal();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	
	public void printB(){
		try {
			lock.lock();
			while(state==false){
				condition.await();
			}
			System.out.println("print B");
			state=false;
			condition.signal();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
}
