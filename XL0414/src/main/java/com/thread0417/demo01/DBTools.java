package com.thread0417.demo01;

public class DBTools {

	volatile private boolean prevIsA = false;
	
	synchronized public void backupA(){
		try {
			while(prevIsA==true){
				wait();
			}
			for(int i=0;i<1;i++){
				System.out.println("AAAAAAA");
			}
			prevIsA = true;
			notifyAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	synchronized public void backupB(){
		try {
			while(prevIsA==false){
				wait();
			}
			for(int i=0;i<1;i++){
				System.out.println("BBBBBB");
			}
			prevIsA = false;
			notifyAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
