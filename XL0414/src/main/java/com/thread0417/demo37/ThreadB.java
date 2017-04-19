package com.thread0417.demo37;

public class ThreadB extends Thread {

	private Service service;
	public ThreadB(Service service) {
		// TODO Auto-generated constructor stub
		this.service = service;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		service.read();
	}
	
}
