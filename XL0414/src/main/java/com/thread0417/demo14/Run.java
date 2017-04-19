package com.thread0417.demo14;

public class Run {

	public static void main(String[] args) {
		MyService service = new MyService();
		MyThread myThread1 = new MyThread(service);
		MyThread myThread2 = new MyThread(service);
		MyThread myThread3 = new MyThread(service);
		MyThread myThread4 = new MyThread(service);
		MyThread myThread5 = new MyThread(service);
		
		myThread1.start();
		myThread2.start();
		myThread3.start();
		myThread4.start();
		myThread5.start();
	}
}
