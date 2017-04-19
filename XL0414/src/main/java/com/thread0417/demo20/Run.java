package com.thread0417.demo20;

public class Run {

	public static void main(String[] args) {
		PrintData pd= new PrintData();
		ThreadA a = new ThreadA(pd);
		ThreadB b = new ThreadB(pd);
		a.start();
		b.start();
	}
}
