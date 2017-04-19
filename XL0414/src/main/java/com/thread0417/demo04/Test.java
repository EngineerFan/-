package com.thread0417.demo04;

public class Test {

	public static void main(String[] args) {
		try {
			MyThread threadTest = new MyThread();
			threadTest.start();
			threadTest.join(2000);
			System.out.println("end Timer="+System.currentTimeMillis());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
