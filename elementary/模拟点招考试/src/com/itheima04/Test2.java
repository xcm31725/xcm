package com.itheima04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 2.复制文本文件，分别用2中方式实现（文件自行创建，存放在根目录）（10分）
	普通字符流的读写。
	高效字符流的读写。

 * */
public class Test2 {

	public static void main(String[] args) throws IOException {
		String fileName = "Test05.txt";
		String copy = "abc.txt";
		
		//method1(fileName,copy);
		method2(fileName,copy);
	}
	
	public static void method1(String fileName,String copy) throws IOException {
		FileReader fr = new FileReader(fileName);
		FileWriter fw = new FileWriter(copy);
		
		int ch;
		while((ch=fr.read())!=-1){
			fw.write(ch);
			fw.flush();
			
			System.out.println((char)ch);
		}
		fw.close();
		fr.close();
	}
	
	public static void method2(String fileName,String copy) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		BufferedWriter bw = new BufferedWriter(new FileWriter(copy));
		
		int ch;
		while((ch=br.read())!=-1){
			bw.write(ch);
			bw.flush();
		}
		bw.close();
		br.close();
		
	}

}
