package com.itheima_02;
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

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDemo02 {

	public static void main(String[] args) throws IOException {
		// 创建输入流
		FileReader fr = new FileReader("FileWriterDemo.java");
		// 创建输出流
		FileWriter fw = new FileWriter("Copy2.java");

		// 创建字符数组
		char[] chs = new char[1024];
		int len;

		// 读写数据
		while ((len = fr.read(chs)) != -1) {
			// System.out.print(new String(chs,0,len));
			fw.write(chs, 0, len);
		}

		// 释放资源
		fw.close();
		fr.close();

	}

}
