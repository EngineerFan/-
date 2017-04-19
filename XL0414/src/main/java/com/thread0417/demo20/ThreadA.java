package com.thread0417.demo20;

public class ThreadA extends Thread{

	private PrintData printData;
	public ThreadA(PrintData printData) {
		this.printData =printData;
	}
	
	public void run() {
		 while(true){
			 printData.printA();
			 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	};
}
