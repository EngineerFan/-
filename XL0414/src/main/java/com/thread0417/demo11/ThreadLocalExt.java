package com.thread0417.demo11;

import java.util.Date;

public class ThreadLocalExt extends ThreadLocal{

	@Override
	protected Object initialValue() {
		return new Date().getTime();
	}
	
}
