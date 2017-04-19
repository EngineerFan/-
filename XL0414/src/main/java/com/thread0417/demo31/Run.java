package com.thread0417.demo31;

public class Run {

	public static void main(String[] args){
		final MyService  myService = new MyService();
		Runnable runnable = new Runnable() {
			public void run() {
				myService.waitMethod();
			}
		};
		Thread threadA = new Thread(runnable);
		threadA.setName("A");
		threadA.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread threadB =new Thread(runnable);
		threadB.setName("B");
		threadB.start();
		threadB.interrupt();
		System.out.println("main end!");
	}
}
