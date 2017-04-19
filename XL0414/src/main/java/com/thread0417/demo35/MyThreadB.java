package com.thread0417.demo35;

public class MyThreadB extends Thread{

	private Service service;
	
	public MyThreadB(Service service) {
		// TODO Auto-generated constructor stub
		this.service = service;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		service.notifyMethod();
	}
	
}
