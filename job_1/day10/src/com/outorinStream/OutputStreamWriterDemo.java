package com.outorinStream;
/*
 * 需求：读取项目根目录下的SystemInOutDemo.java，并输出到命令行
 * 
 * 数据源：项目根目录下的SystemInOutDemo.java	BufferedReader
 * 目的地：命令行	System.out
 * 
 * 
 * 由于标准输出流是一个字节输出流，所以只能输出字节或者字节数组，但是我们读取到的数据则是字符串，如果想进行输出还需要转换成字节数组
 * 我们要想通过标准输出流输出字符串，把标准输出流转换成一种字符输出流即可，OutputStreamWriter
 * 
 * OutputStreamWriter(OutputStream out) :转换流，把字节输出流转换成字符输出流
 * 
 * 
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterDemo {

	public static void main(String[] args) throws IOException {
		method();
		
		//method1();
		
		//method2();
		
	}

	private static void method2() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("FileDemo.java"));

		//创建输出流对象
		//OutputStream os = System.out;
		Writer w = new OutputStreamWriter(System.out);//多态，父类型引用指向子类对象
		
		BufferedWriter bw = new BufferedWriter(w);
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line;
		while((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			
			//w.write(line);
			//w.write("\r\n");
		}
		
		br.close();
		bw.close();
	}

	private static void method1() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("FileDemo.java"));
		OutputStream ow = System.out;
		
		String line;
		while((line = br.readLine()) != null) {
			ow.write(line.getBytes());
			ow.write("\r\n".getBytes());
		}
		
		ow.close();
		br.close();
	}

	private static void method() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("FileDemo.java"));

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line;
		while((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}

}
