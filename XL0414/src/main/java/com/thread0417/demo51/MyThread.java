package com.thread0417.demo51;

public class MyThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++){
			System.out.println(MyObject.getInstance().hashCode());
		}
	}
}
