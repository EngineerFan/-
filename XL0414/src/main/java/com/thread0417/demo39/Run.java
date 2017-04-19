package com.thread0417.demo39;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;



public class Run {

	private static Timer timer = new Timer();
	
	static public class MyTask extends TimerTask{

		@Override
		public void run() {
			System.out.println("运行了！时间为："+new Date());
		}
		
	}
	public static void main(String[] args) {
		try {
			MyTask task = new MyTask();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dataString = "2017-04-18 14:45:40";
			Date date = sdf.parse(dataString);
			System.out.println("字符串时间:"+date.toLocaleString()+" 当前时间："+new Date().toLocaleString());
			timer.schedule(task,date);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
