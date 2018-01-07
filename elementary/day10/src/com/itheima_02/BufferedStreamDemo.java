package com.itheima_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamDemo {

	public static void main(String[] args) throws IOException {
		/*BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
		
		bw.write("hello");
		bw.flush();
		
		bw.close();*/
		
		BufferedReader br = new BufferedReader(new FileReader("FileWriterDemo.java"));
		
		/*int ch;
		while((ch=br.read())!=-1){
			System.out.print((char)ch);
		}*/
		
		char[] chs = new char[1024];
		int len;
		
		while((len=br.read(chs))!=-1){
			System.out.println(new String(chs,0,len));
		}
		
		br.close();
	}

}
