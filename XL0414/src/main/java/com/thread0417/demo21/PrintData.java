package com.thread0417.demo21;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintData {

	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
    volatile private boolean tempStatus = false;
	public void printA() {
		try {
            lock.lock();
            while(tempStatus==true){
            	condition.await();
            }
            System.out.println("A");
            tempStatus = true;
            condition.signalAll();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}

	public void printB() {
		try {
           lock.lock();
           while(tempStatus==false){
        	   condition.await();
           }
           System.out.println("B");
           tempStatus = false;
           condition.signalAll();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}

}
