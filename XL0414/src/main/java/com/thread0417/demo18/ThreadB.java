package com.thread0417.demo18;

public class ThreadB extends Thread {

	private MyService myService;
	
	public ThreadB(MyService myService) {
		this.myService =myService;
	}
	
	@Override
	public void run() {
		myService.awaitB();
	}
}
