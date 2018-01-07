package com.itheima_01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CoqyFileTest {

	public static void main(String[] args) throws IOException {
		
		long s = System.currentTimeMillis();

		FileReader fr = new FileReader("FileWriterDemo.java");
		
		FileWriter fw = new FileWriter("Copy.java");
		
		int h;
		
		while((h=fr.read())!=-1){
			fw.write(h);
		}

		fr.close();
		fw.close();
		
		long e = System.currentTimeMillis();
		System.out.println(e-s);
	}

}
