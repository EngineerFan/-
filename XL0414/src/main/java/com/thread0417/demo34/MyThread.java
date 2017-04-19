package com.thread0417.demo34;

public class MyThread extends Thread{

	private Service service;
	public MyThread(Service service) {
		this.service =service;
	}
	
	@Override
	public void run() {
		service.testMethod();
	}
	
}
