package com.thread0417.demo47;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;



public class Run1 {

	private static Timer timer = new Timer();
	private static int runCount =0;
	static public class MyTask1 extends TimerTask{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				System.out.println("1 begin 运行了！时间为："+new Date());
				Thread.sleep(5000);
				System.out.println("1   end 运行了！时间为："+new Date());
				runCount++;
				if(runCount==5){
					timer.cancel();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	public static void main(String[] args) {
		try {
			MyTask1 task1 = new MyTask1();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String  dateString1 ="2017-04-18 17:06:00";
			Date date = sdf.parse(dateString1);
			System.out.println("字符串1时间："+date.toLocaleString()+" 当前时间："+new Date());
			timer.schedule(task1,date,2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
