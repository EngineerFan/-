package com.thread0417.demo33;

public class Run {

	public static void main(String[] args) {
		final Service service = new Service();
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+"调用waitMethod时间："+System.currentTimeMillis());
				service.waitMethod();
				
			}
		};
		Thread threadA = new Thread(runnable);
		threadA.setName("A");
		threadA.start();
		Thread threadB = new Thread(runnable);
		threadB.setName("B");
		threadB.start();
	}
}
