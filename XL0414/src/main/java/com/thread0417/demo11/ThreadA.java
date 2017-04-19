package com.thread0417.demo11;

public class ThreadA extends Thread{

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("ThreadA线程中取值="+Tools.t1.get());
				Thread.sleep(100);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
