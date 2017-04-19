package com.thread0417.demo43;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run {

	static public class Mytask extends TimerTask{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
			    System.out.println("A 运行了！时间为："+new Date());
				Thread.sleep(5000);
				System.out.println("A 结束了！时间为："+new Date());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		try {
			Mytask task = new Mytask();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dataString ="2017-04-18 16:22:00";
			Date date = sdf.parse(dataString);
			System.out.println("字符串时间："+date.toLocaleString()+" 当前时间："+new Date().toLocaleString());
			Timer timer = new Timer();
			timer.schedule(task, date,4000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
