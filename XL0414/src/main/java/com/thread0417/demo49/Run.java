package com.thread0417.demo49;

public class Run {

	static public class MyThread extends Thread{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println(MyObject.getInstance().hashCode());
		}
	}
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		t1.start();
		t2.start();
		t3.start();
	}
}
