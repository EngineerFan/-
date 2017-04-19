package com.thread0417.demo01;

public class BackupB extends Thread{

	private DBTools dbtools;
	public BackupB(DBTools dbtools) {
		this.dbtools =dbtools;
	}
	@Override
	public void run() {
		dbtools.backupB();
	}
}
