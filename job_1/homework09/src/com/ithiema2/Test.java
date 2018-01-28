package com.ithiema2;

import java.io.File;

/*
 * 2、统计指定文件夹的大小
		分析:
			1,定义一个方法,参数File f
			2,定义一个求和变量,用于累加所有文件的大小
			3,判断是否是文件夹
				如果是,继续
				如果不是,退出
			4,获取当前目录下所有的文件以及文件夹
			5,遍历,拿到每一个File对象,判断是否是文件
				如果是,将该文件的大小累加到求和变量里
				如果不是,调用方法(自己)
 * */
public class Test {

	public static void main(String[] args) {
		File f = new File("a");
		System.out.println(show(f));
	}
	
	public static long show(File file) {
		long sum = 0;
		
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f : files) {
				sum += show(f);
			}
		}else {
			sum = file.length();
		}
		return sum;
	}
}
