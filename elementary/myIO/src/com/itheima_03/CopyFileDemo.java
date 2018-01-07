package com.itheima_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 需求：
 * 		把项目路径下的FileWriterDemo.java中的内容复制到项目路径下的Copy.java中
 * 
 * 文件复制也是有规律可循的，也就是说有套路。
 * 
 * 数据源：
 * 		FileWriterDemo.java -- 读数据 -- FileReader
 * 目的地：
 * 		Copy.java -- 写数据 -- FileWriter
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("FileWriterDemo.java"));

		BufferedWriter bw = new BufferedWriter(new FileWriter("Copy3.java"));

		/*
		 * int ch; while((ch=br.read())!=-1){ bw.write((char)ch); }
		 */

		char[] chs = new char[1024];
		int len;
		while ((len = br.read(chs)) != -1) {
			bw.write(chs, 0, len);
		}

		bw.close();
		br.close();
	}
}
