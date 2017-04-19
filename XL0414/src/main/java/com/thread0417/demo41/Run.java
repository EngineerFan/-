package com.thread0417.demo41;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run {

	private static Timer timer = new Timer();
	
	static public class Task1 extends TimerTask{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("运行了！时间为："+new Date());
		}
		
	}
	static public class Task2 extends TimerTask{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("运行了！时间为："+new Date());
		}
		
	}
	public static void main(String[] args) {
		try {
			Task1 t1 = new Task1();
			Task2 t2 = new Task2();
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dataString1 ="2017-04-18 15:13:00";
			String dataString2 ="2017-04-18 15:14:00";
			Date date1 =sdf1.parse(dataString1);
			Date date2 =sdf2.parse(dataString2);
			System.out.println("字符串时间："+date1.toLocaleString()+" 当前时间："+new Date().toLocaleString());
			System.out.println("字符串时间："+date2.toLocaleString()+" 当前时间："+new Date().toLocaleString());
			timer.schedule(t1,date1);
			timer.schedule(t2,date2);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
