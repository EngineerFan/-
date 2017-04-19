package com.thread0417.demo35;

public class MyThreadA extends Thread{

	private Service service;
	public MyThreadA(Service service) {
		this.service = service;
    }
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		service.waitMethod();
	}
}
