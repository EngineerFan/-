package com.thread0417.demo48;

public class MyObject {

	private static MyObject myObject = new MyObject();
	
	private MyObject(){}
	
	public static MyObject getInstance(){
		return myObject;
	}
}
