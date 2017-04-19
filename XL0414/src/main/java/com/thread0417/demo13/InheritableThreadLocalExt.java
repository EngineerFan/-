package com.thread0417.demo13;

import java.util.Date;

public class InheritableThreadLocalExt extends InheritableThreadLocal {

	@Override
	protected Object initialValue() {
		return new Date().getTime();
	}
	
	@Override
	protected Object childValue(Object parentValue) {
		// TODO Auto-generated method stub
		return parentValue+"子线程添加";
	}
}
