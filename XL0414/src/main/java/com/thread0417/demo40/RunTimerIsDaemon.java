package com.thread0417.demo40;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class RunTimerIsDaemon {

	private static Timer timer = new Timer();
	
	static public class MyTask extends TimerTask{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("运行了！时间为："+new Date());
		}
		
	}
	public static void main(String[] args) {
		try {
			MyTask task = new MyTask();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dataString = "2017-04-18 15:00:00";
			Date date =format.parse(dataString);
			System.out.println("字符串时间："+date.toLocaleString()+" 当前时间："+new Date());
			timer.schedule(task, date);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
