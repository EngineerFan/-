package com.thread0417.demo03;

public class Run {

	public static void main(String[] args) {
		try {
			ThreadB b = new ThreadB();
			b.start();
			Thread.sleep(500);
			ThreadC c = new ThreadC(b);
			c.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
