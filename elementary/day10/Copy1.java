package com.itheima;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 需求：往文件中写数据
 * 		写数据--输出流--FileWriter
 * FileWriter：
 * 		FileWriter(String fileWriter):传输一个文件名称
 * 
 * 输出流写数据的步骤
 * 		A:创建输出流对象
 * 		B:调用输出流对象的写数据的方法
 * 		C:释放资源close()和filsh()方法的区别
 * 		filsh()：刷新缓存区，流对象可以继续调用
 * 		close()：先刷新缓冲区，然后通知系统释放资源。流对象不可以被使用了。
 * */
public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// 创建IO流对象
		FileWriter fw = new FileWriter("d:\\a.txt");
		/*
		 * 创建输出流对象写的数据方法 
		 * A:调用系统资源创建了一个文件 
		 * B:创建输出流对象 
		 * C：把输出流对象指向文件
		 */

		// 调用输出流对象写数据图解
		// 写一个字母
		fw.write("IO流你好");
		// 数据没有直接写到文件，其实是写到了内存
		fw.flush();

		// 释放资源
		// 通过系统释放和该文件相关的资源
		fw.close();

	}

}
