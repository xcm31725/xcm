package com.itheima_01;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo02 {

	public static void main(String[] args) throws IOException {
		// 创建输入流
		// FileReader fr = new FileReader("fr2.txt");
		FileReader fr = new FileReader("Copy.java");

		// 调用输入流对象的读数据方法
		// int read(char[] cbuf)：一次读取一个字符数组的数据，返回的是实际读取的字符个数
		char[] chs = new char[1024];// 这里可以是1024及其整数倍
		/*
		 * int len;
		 * 
		 * //第一次读数据 len = fr.read(chs); System.out.println("len:"+len);
		 * System.out.println(chs);
		 * 
		 * //第二次读数据 len = fr.read(chs); System.out.println("len:"+len);
		 * System.out.println(chs);
		 * 
		 * //第三次读数据 len = fr.read(chs); System.out.println("len:"+len);
		 * System.out.println(chs);
		 * 
		 * len = fr.read(chs); System.out.println("len:"+len);
		 * //System.out.println(chs);
		 * 
		 * len = fr.read(chs); System.out.println("len:"+len);
		 * //System.out.println(chs);
		 */

		int len;
		while ((len = fr.read(chs)) != -1) {
			// System.out.print(chs);
			System.out.print(new String(chs, 0, len));
		}

		fr.close();
	}

}
