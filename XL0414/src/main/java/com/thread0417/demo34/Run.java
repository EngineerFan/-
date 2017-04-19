package com.thread0417.demo34;

public class Run {

	public static void main(String[] args) {
		try {
			Service service = new Service();
			MyThread myThread  = new MyThread(service);
			myThread.start();
			Thread.sleep(3000);
			myThread.interrupt();
		} catch (Exception e) {
			// TODO: handle exception
		    e.printStackTrace();
		}
	}
}
