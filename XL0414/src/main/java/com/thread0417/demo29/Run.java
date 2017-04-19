package com.thread0417.demo29;

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
	}
}
