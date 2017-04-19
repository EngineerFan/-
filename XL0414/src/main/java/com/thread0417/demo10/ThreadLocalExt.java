package com.thread0417.demo10;

public class ThreadLocalExt extends ThreadLocal{

	@Override
	protected Object initialValue() {
		// TODO Auto-generated method stub
		return "默认值";
	}
	public static void main(String[] args) {
		ThreadLocalExt t1 = new ThreadLocalExt();
		if(t1.get()==null){
			System.out.println("从未放过值");
			t1.set("我的值1");
		}
		System.out.println(t1.get());
		
	}
}
