package com.thread0417;

public class TestMain {

	public static void main(String[] args) {
		PrintData pd = new PrintData();
		ThreadA[] ta=new ThreadA[10];
		ThreadB[] tb=new ThreadB[10];
		for (int i = 0; i < ta.length; i++) {
			ta[i] = new ThreadA(pd);
		}
		for(int i = 0; i < tb.length; i++){
			tb[i] = new ThreadB(pd);
		}
		for (int j = 0; j < 10; j++) {
			 ta[j].start();
			 tb[j].start();
		}
//		for (int i = 0; i < 10; i++) {
//			ThreadA ta = new ThreadA(pd);
//			ThreadB tb = new ThreadB(pd);
//			ta.start();
//			tb.start();
//		}
	   try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
