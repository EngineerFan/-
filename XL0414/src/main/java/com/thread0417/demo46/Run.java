package com.thread0417.demo46;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run {

	static public class MyTask extends TimerTask{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("运行了！时间为："+new Date());
		}
	}
	public static void main(String[] args) {
		MyTask task = new MyTask();
		Timer timer = new Timer();
		System.out.println("当前时间："+new Date().toLocaleString());
		timer.schedule(task,3000, 7000);
	}
}