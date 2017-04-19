package com.thread0417;

public class ThreadA extends Thread{

	private PrintData printData;
	
	public ThreadA(PrintData printData) {
		this.printData = printData;
	}
	
	@Override
	public void run() {
        printData.downLoadA();
		
	}
}
