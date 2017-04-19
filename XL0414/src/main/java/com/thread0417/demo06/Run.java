package com.thread0417.demo06;

public class Run {

	public static void main(String[] args) {
		try {
			ThreadB b = new ThreadB();
			ThreadA a = new ThreadA(b);
			a.start();
			b.start();
			b.join(2000);
			System.out.println(Thread.currentThread().getState());
			System.out.println("   main end "+System.currentTimeMillis());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
