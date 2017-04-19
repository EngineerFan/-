package com.thread0417.demo42;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run2Later {

	private static Timer timer = new Timer();
	
	static public class MyTask1 extends TimerTask{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				System.out.println("1 begin 运行了！时间为："+new Date());
				Thread.sleep(20000);
				System.out.println("1   end 运行了！时间为："+new Date());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	static public class MyTask2 extends TimerTask{

		@Override
		public void run() {
			System.out.println("2 begin 运行了！时间为："+new Date());
			System.out.println("运行了！时间为: "+new Date());
			System.out.println("2   end 运行了！时间为："+new Date());
		}
		
	}
	public static void main(String[] args) {
		try {
			MyTask1 myTask1 = new MyTask1();
			MyTask2 myTask2 = new MyTask2();
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dataString1 = "2017-04-18 15:29:00";
			String dataString2 = "2017-04-18 15:29:10";
			Date date1 =sdf1.parse(dataString1);
			Date date2 =sdf2.parse(dataString2);
			System.out.println("字符串时间："+date1.toLocaleString()+" 当前时间："+new Date());
			System.out.println("字符串时间："+date2.toLocaleString()+" 当前时间："+new Date());
			timer.schedule(myTask1, date1);
			timer.schedule(myTask2, date2);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
