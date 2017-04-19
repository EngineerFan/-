package com.thread0417;

public class PrintData {

	private String variateA ="A";
	private String variateB ="B";
	volatile private static int N =20;
	volatile private boolean isPermit = false;
	
	synchronized public void downLoadA(){
		try {
			while(isPermit==true){
				wait();
			}
			System.out.println(variateA+" N="+N);
			N--;
			isPermit = true;
			notifyAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	synchronized public void downLoadB(){
		try {
			while(isPermit==false){
				wait();
			}
			System.out.println(variateB+" N="+N);
			N--;
			isPermit=false;
			notifyAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
