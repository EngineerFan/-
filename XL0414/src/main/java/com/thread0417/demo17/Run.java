package com.thread0417.demo17;

public class Run {
	
	public static void main(String[] args) throws InterruptedException {
		MyService myService = new MyService();
		ThreadA a = new ThreadA(myService);
		a.start();
		Thread.sleep(3000);
		myService.signal();
	}
}
