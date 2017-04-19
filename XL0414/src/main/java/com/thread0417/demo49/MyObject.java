package com.thread0417.demo49;

public class MyObject {

	//DCL double-check-locking双重检验锁 延迟懒汉式单例模式
//	private static MyObject myObject;
//	private MyObject(){}
//	
//	public static MyObject getInstance(){
//		if(myObject==null){
//			synchronized (MyObject.class) {
//				if(myObject==null){
//				myObject =new MyObject();
//			}
//			}
//		}
//		return myObject;
//	}
	private static class MyObjectHandler{
		private static MyObject myObject = new MyObject();
	}
		
		private MyObject(){}
		
		public static MyObject getInstance(){
			return MyObjectHandler.myObject;
		}
}
