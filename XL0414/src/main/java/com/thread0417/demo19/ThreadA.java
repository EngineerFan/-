package com.thread0417.demo19;

public class ThreadA extends Thread {

	private MyService myService;
	
	public ThreadA(MyService myService) {
		this.myService = myService;
	}
	@Override
	public void run() {
		myService.awaitA();
	}
}
