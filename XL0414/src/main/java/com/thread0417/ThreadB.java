package com.thread0417;

public class ThreadB extends Thread{


	private PrintData printData;
	public ThreadB(PrintData printData) {
		this.printData = printData;
	}
	
	@Override
	public void run() {
		printData.downLoadB();
		
	
}
}
