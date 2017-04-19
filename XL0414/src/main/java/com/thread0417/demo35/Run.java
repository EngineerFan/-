package com.thread0417.demo35;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();
		MyThreadA a = new MyThreadA(service);
		a.start();
		Thread.sleep(2000);
		MyThreadB b = new MyThreadB(service);
		b.start();
	}
}
