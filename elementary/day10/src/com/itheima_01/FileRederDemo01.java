package com.itheima_01;
/*
 * 需求：从文件中读数据并显示到控制台
 * 		读数据--输入流--FileReader
 * 
 * FileReader:
 * 		FileReader(String fileName):传递文件名称
 * 
 * 输入流读文件的步骤：
 * 		A:创建输入流对象
 * 		B:调用输入流对象的读数据方法
 * 		C:释放资源
 * 
 * java.io.FileNotFoundException: fr.txt (系统找不到指定的文件。)
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRederDemo01 {

	public static void main(String[] args) throws IOException {
		// FileReader fr = new FileReader("fr.txt");
		FileReader fr = new FileReader("FileWriterDemo.java");

		// 调用输入流对象的读数据方法
		/*
		 * //用read()方法 //第一次读取数据 int ch = fr.read(); System.out.println(ch);
		 * System.out.println((char)ch);
		 * 
		 * //第二次读取数据 ch = fr.read(); System.out.println(ch);
		 * System.out.println((char)ch);
		 * 
		 * //第三次读取数据 ch = fr.read(); System.out.println(ch);
		 * System.out.println((char)ch);
		 * 
		 * //第四次读取数据 ch = fr.read(); System.out.println(ch);
		 * 
		 * //第五次读取数据 ch = fr.read(); System.out.println(ch);
		 */

		int ch;
		while ((ch = fr.read()) != -1) {
			// System.out.println(ch);
			// System.out.println((char)ch);
			System.out.print((char) ch);
		}

		fr.close();

	}

}
