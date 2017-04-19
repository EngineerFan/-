package com.thread0417.demo05;

public class ThreadA extends Thread{

	private ThreadB b;
	public ThreadA(ThreadB b) {
		this.b = b;
	}
	@Override
	public void run() {
		try {
			synchronized (b) {
				b.start();
				b.join();
				for(int i=0;i<Integer.MAX_VALUE;i++){
					String newString = new String();
					Math.random();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
