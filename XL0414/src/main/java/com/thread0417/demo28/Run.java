package com.thread0417.demo28;

public class Run {

	public static void main(String[] args) {
		final Service service = new Service(true);
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				service.serviceMethod();	
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		final Service service2 = new Service(false);
		runnable = new Runnable() {
			
			@Override
			public void run() {
				service2.serviceMethod();
				
			}
		};
		thread = new Thread(runnable);
		thread.start();
	}
}
