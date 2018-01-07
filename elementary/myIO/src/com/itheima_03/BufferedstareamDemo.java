package com.itheima_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * BufferedWriter:将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入。 
 * BufferedReader:从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取。
 */
public class BufferedstareamDemo {

	public static void main(String[] args) throws IOException {
		// 创建输出缓冲流对象
		/*
		 * BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
		 * 
		 * bw.write("hello"); bw.flush(); bw.close();
		 */
		// 创建输入缓冲流对象
		BufferedReader br = new BufferedReader(new FileReader("Copy.java"));

		/*
		 * //一个字符的读取 int ch; while((ch=br.read())!=-1){
		 * System.out.print((char)ch); }
		 */

		// 一个字符串的读取
		char[] chs = new char[1024];
		int len;
		while ((len = br.read(chs)) != -1) {
			System.out.print(new String(chs, 0, len));
		}

		br.close();
	}

}
