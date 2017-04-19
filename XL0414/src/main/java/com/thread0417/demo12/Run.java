package com.thread0417.demo12;

public class Run {

	public static void main(String[] args) {
		try {
			for (int i = 0; i <10; i++) {
				System.out.println(" Main线程中取值="+Tools.t1.get());
				Thread.sleep(100);
			}
			Thread.sleep(5000);
			ThreadA  a = new ThreadA();
			a.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
