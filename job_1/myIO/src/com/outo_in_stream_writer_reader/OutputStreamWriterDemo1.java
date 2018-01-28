package com.outo_in_stream_writer_reader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * 
 * @ClassName: OutputStreamWriterDemo1  
 * @Description: TODO 
 * 需求：读取项目根目录下的FileDemo.java，并输出到命令行
 * 
 * 数据源：项目目录下的FileDemo.java BufferedReader
 * 目的地：命令行
 * 
 * 由于标准输出流是一个字节输出流,所以只能输出字节或者字节数组，
 * 但是我们读取的数据则是字符串，如果想进行输出还需要转换成字节数组
 * 
 * 我们要想通过标准输出流输出字符串，把标准输出流转换成一种字符输出流即可，
 * OutputStreamWriter
 * 
 * OutputStreamWriter(OutputStream out) :转换流，把字节输出流转换成字符输出流
 * 
 * @author sudong
 * @date 2018年1月21日 下午6:15:38  
 *
 */
public class OutputStreamWriterDemo1 {

	public static void main(String[] args) throws IOException {
		//method1();
		
		//method2();
		
		BufferedReader br = new BufferedReader(new FileReader("FileDemo.java"));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//Writer w = new OutputStreamWriter(System.out);//多态父类引用执行子类对象
		
		String line;
		
		while((line = br.readLine()) != null) {
			bw.write(line);
			bw.write("\r\n");
			bw.flush();
		}
		
		br.close();
		bw.close();
		
		
	}

	private static void method2() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("FileDemo.java"));
		
		Writer w = new OutputStreamWriter(System.out);//多态父类引用执行子类对象
		
		String line;
		
		while((line = br.readLine()) != null) {
			w.write(line);
			w.write("\r\n");
			w.flush();
		}
		
		br.close();
		w.close();
	}

	private static void method1() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("FileDemo.java"));
		
		//OutputStreamWriter osw = new OutputStreamWriter(System.out);
		//创建输出流对象
		OutputStream osw = System.out;
		
		
		String line;
		
		while((line = br.readLine()) != null) {
			osw.write(line.getBytes());//将字符串转化成字符
			osw.write("\r\n".getBytes());
			osw.flush();
		}
		
		br.close();
		osw.close();
	}

}
