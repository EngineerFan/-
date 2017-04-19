package com.thread;

import java.io.PipedOutputStream;

public class ThreadWrite extends Thread{

	private WriterData write;
	private PipedOutputStream out;
	public ThreadWrite(WriterData write,PipedOutputStream out) {
		this.write = write;
		this.out = out;
	}
	@Override
	public void run() {
		write.writeMethod(out);
	}
}
