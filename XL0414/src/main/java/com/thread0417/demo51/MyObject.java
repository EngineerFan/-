package com.thread0417.demo51;

public class MyObject {

	private static MyObject instance = null;
	private MyObject(){}
	static{
		instance = new MyObject();
	}
	public static MyObject getInstance(){
		return instance;
	}
}
