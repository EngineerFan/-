package com.thread0417.demo08;

public class ThreadB extends Thread{

	@Override
	public void run() {
		try {
			for (int i = 0; i < 100; i++) {
				Tools.t1.set("ThreadB"+(i+1));
				System.out.println("ThreadB get Value="+Tools.t1.get());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
