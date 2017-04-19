package com.thread0417.demo06;

public class ThreadB extends Thread{

	synchronized public void run(){
		try {
			System.out.println("begin B ThreadName="+Thread.currentThread().getName()+" "+System.currentTimeMillis());
			Thread.sleep(3000);
			System.out.println("  end B ThreadName="+Thread.currentThread().getName()+" "+System.currentTimeMillis());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
