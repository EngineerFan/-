package com.thread0417.demo20;

public class ThreadB extends Thread {

	private PrintData printData;
	
	public ThreadB(PrintData printData) {
		this.printData = printData;
	}
	@Override
	public void run() {
		while (true) {
			printData.printB();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
