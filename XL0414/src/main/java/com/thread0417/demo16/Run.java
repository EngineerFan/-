package com.thread0417.demo16;

public class Run {

	public static void main(String[] args) {
		MyService myService = new MyService();
		ThreadA a = new ThreadA(myService);
		a.start();
	}
}
