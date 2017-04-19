package com.thread0417.demo44;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run {
    private static Timer timer = new Timer();
	static public class MyTaskA extends TimerTask{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("A 运行了！时间为："+new Date());
			timer.cancel();
		}
		
	}
	static public class MyTaskB extends TimerTask{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("B 运行了！时间为："+new Date());
		}
		
	}
	public static void main(String[] args) {
		try {
			MyTaskA taskA = new MyTaskA();
			MyTaskB taskB = new MyTaskB();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2017-04-18 16:32:00";
//			Timer timer = new Timer();
			Date date = sdf.parse(dateString);
			System.out.println("字符串时间:"+date.toLocaleString()+" 当前时间："+new Date());
			timer.schedule(taskA, date,4000);
			timer.schedule(taskB, date,4000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
