package com.thread0417.demo01;

public class BackupA extends Thread {

	private DBTools dbtools;
	
    public BackupA(DBTools dbtools) {
		this.dbtools = dbtools;
	}
	@Override
	public void run() {
		dbtools.backupA();
	}
}
