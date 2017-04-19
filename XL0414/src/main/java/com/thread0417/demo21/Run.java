package com.thread0417.demo21;

public class Run {

	public static void main(String[] args) {
		
		PrintData printData = new PrintData();
		for (int i = 0; i < 10; i++) {
			ThreadA a = new ThreadA(printData);
			a.start();
			ThreadB b = new ThreadB(printData);
			b.start();
		}
	}
}
