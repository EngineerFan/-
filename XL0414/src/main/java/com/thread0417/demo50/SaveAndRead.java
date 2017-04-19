package com.thread0417.demo50;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaveAndRead {

	public static void main(String[] args) {
		try {
			MyObject myObject = MyObject.getInstance();
			FileOutputStream fosRef =new FileOutputStream(new File("myObjectFile.txt"));
			ObjectOutputStream oosRef = new ObjectOutputStream(fosRef);
			oosRef.writeObject(myObject);
			oosRef.close();
			fosRef.close();
			System.out.println(myObject.hashCode());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			FileInputStream fisRef = new FileInputStream(new File("myObjectFile.txt"));
			ObjectInputStream iosRef = new ObjectInputStream(fisRef);
			MyObject myObject = (MyObject) iosRef.readObject();
			iosRef.close();
			fisRef.close();
			System.out.println(myObject.hashCode());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
