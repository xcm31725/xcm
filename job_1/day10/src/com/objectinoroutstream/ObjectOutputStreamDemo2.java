package com.objectinoroutstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectOutputStreamDemo2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		//method();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c.txt"));
		
		Object obj = ois.readObject();
		
		ArrayList<Student> list = (ArrayList<Student>) obj;
		
		for (Student student : list) {
			System.out.println(student);
		}
		ois.close();
	}

	private static void method() throws IOException, FileNotFoundException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c.txt"));
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student("xcm",18));
		list.add(new Student("xgd",23));
		
		oos.writeObject(list);
		
		oos.close();
	}

}
