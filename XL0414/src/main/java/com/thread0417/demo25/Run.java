package com.thread0417.demo25;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		final Service service = new Service();
		Runnable runnable =new Runnable() {
			
			@Override
			public void run() {
				service.waitMethod();
				
			}
		};
		Thread[] threads =new Thread[10];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(runnable);
		}
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
		Thread.sleep(2000);
		service.notifyMethod();
	}
}
