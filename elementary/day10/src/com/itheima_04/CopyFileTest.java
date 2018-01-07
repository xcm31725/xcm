package com.itheima_04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileTest {

	public static void main(String[] args) throws IOException {
		String scrName = "FileWriterDemo.java";
		String destName = "Copy.java";
		long s = System.currentTimeMillis();
//		method1(scrName,destName);//
//		method2(scrName,destName);//959
//		method3(scrName,destName);//
//		method4(scrName,destName);//833
//		method5(scrName,destName);//
		long e = System.currentTimeMillis();
		System.out.println(e-s);
	}
	
	public static void method5(String scrName,String destName) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(scrName));
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(destName));
		
		String line;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
		br.close();
		
	}

	
	public static void method4(String scrName,String destName) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(scrName));
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(destName));
		
		char[] chs = new char[1024];
		int len;
		while((len=br.read(chs))!=-1){
			bw.write(chs,0,len);
			bw.flush();
			//System.out.print(new String(chs,0,len));
		}
		
		bw.close();
		br.close();
		
	}
	
	public static void method3(String scrName,String destName) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(scrName));
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(destName));
		
		
		int ch;
		while((ch=br.read())!=-1){
			bw.write(ch);
			bw.flush();
			//System.out.print(ch);
		}
		
		bw.close();
		br.close();
		
	}
	
	public static void method2(String scrName,String destName) throws IOException{
		FileReader fr = new FileReader(scrName);
		
		FileWriter fw = new FileWriter(destName);
		
		
		char[] chs = new char[1024];
		int len;
		while((len=fr.read(chs))!=-1){
			fw.write(chs,0,len);
			fw.flush();
			//System.out.print(new String(chs,0,len));
		}
		
		fw.close();
		fr.close();
		
	}
	
	public static void method1(String scrName,String destName) throws IOException{
		FileReader fr = new FileReader(scrName);
		
		FileWriter fw = new FileWriter(destName);
		
		
		int ch;
		while((ch=fr.read())!=-1){
			fw.write(ch);
			fw.flush();
			//System.out.print(ch);
		}
		
		fw.close();
		fr.close();
		
	}
}
