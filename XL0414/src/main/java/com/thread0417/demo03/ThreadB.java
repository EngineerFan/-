package com.thread0417.demo03;

public class ThreadB extends Thread{

	@Override
	public void run() {
		try {
			ThreadA ta = new ThreadA();
			ta.start();
			ta.join();
			System.out.println("线程B在run end 处打印了");
		} catch (Exception e) {
			System.out.println("线程B在catch处打印了");
			e.printStackTrace();
		}
	}
}
