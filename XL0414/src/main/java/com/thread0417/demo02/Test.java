
package com.thread0417.demo02;

public class Test {

	public static void main(String[] args) {
		MyThread threadTest = new MyThread();
		threadTest.start();
		try {
			threadTest.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("你先执行完，我再执行好吗？");
	}
}
