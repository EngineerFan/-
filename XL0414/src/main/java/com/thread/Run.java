package com.thread;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Run {

	public static void main(String[] args) {
		try {
			WriterData writerData = new WriterData();
			ReadData readData = new ReadData();
			PipedInputStream inputStream = new PipedInputStream();
			PipedOutputStream outputStream = new PipedOutputStream();
			outputStream.connect(inputStream);
			ThreadRead threadRead = new ThreadRead(readData, inputStream);
			threadRead.start();
			Thread.sleep(2000);
			ThreadWrite threadWrite = new ThreadWrite(writerData, outputStream);
			threadWrite.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
