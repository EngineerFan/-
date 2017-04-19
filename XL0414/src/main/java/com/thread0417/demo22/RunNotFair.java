package com.thread0417.demo22;

public class RunNotFair {

	public static void main(String[] args) {
		final Service service = new Service(false);
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("A "+Thread.currentThread().getName()+" 运行了");
				service.serviceMethod();
			}
		};
		Thread[] threadArray = new Thread[10];
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i] = new Thread(runnable);
			threadArray[i].start();
		}
	}
}
