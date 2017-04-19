package com.thread0417.demo15;

public class ThreadBB extends Thread {

	private MyService myService;
    public ThreadBB(MyService myService) {
		this.myService = myService;
	}	
    @Override
    public void run() {
    	myService.methodB();
    }
}
