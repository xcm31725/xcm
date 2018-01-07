package com.itheima_01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileTest1 {

	public static void main(String[] args) throws IOException {
		
		long s = System.currentTimeMillis();//获取系统当前时间一毫米为单位
		FileReader fr = new FileReader("FileWriterDemo.java");
		
		FileWriter fw = new FileWriter("Copy1.java");
		
		char[] chs = new char[1024];
		
		int len;
		
		while((len=fr.read(chs))!=-1){
			fw.write(chs,0,len);
			fw.flush();
		}
		
		fr.close();
		fw.close();
		
		long e = System.currentTimeMillis();
		System.out.println(s);
		System.out.println(e);
		System.out.println(e-s);
	}

}
