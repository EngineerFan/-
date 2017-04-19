package com.thread0417.demo45;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run {

	static int i = 0;
	static public class MyTask extends TimerTask{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("正常执行了 "+i);
		}
		
	}
	public static void main(String[] args) {
		while(true){
			try {
				i++;
				Timer timer = new Timer();
				MyTask task = new MyTask();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String dateString = "2017-04-18 16:40:00";
				Date date = sdf.parse(dateString);
				timer.schedule(task, date);
				timer.cancel();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
