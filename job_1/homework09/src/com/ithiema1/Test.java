package com.ithiema1;

import java.io.File;
import java.util.Scanner;

import javax.xml.soap.SAAJResult;

/*
 * 1、编写一个方法：统计文件夹内指定类型文件的个数（比如：.ext,.java,.doc）
		方法描述：将用户输入的路径以及指定的扩展名传入该方法中，返回该目录下所有符合该扩展名文件的个数
		比如：输入E:\\bbb  ，文件扩展名为 .java 那么需要统计在E:\\bbb  中所有扩展名为.java文件的个数（子文件夹中符合条件的文件也要统计进去）

		分析:
			1,定义一个方法,参数File f,String str
			2,定义一个统计变量,用于统计符合条件的文件的个数
			3,判断是否是文件夹
				如果是,继续
				如果不是,退出
			4,获取当前目录下所有的文件以及文件夹
			5,遍历,拿到每一个File对象,判断是否是文件
				如果是,判断是不是满足指定条件的文件,如果是将该文件的大小累加到统计变量里
				如果不是,调用方法(自己)
 * */
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入路径：");
		String file = sc.nextLine();
		
		System.out.println("请输入后缀名：");
		String str = sc.nextLine();
		
		File f = new File(file);
		
		System.out.println(fileNum(f,str));
	}
	
	public static int fileNum(File f, String str) {
		int count = 0;
		
		if(f.isDirectory()) {
			File[] files = f.listFiles();
			for (File file : files) {
				count += fileNum(file,str);
			}
		}else {
			count++;
		}
		
		/*if(f.isDirectory()) {
			File[] files = f.listFiles();
			
			for (File file : files) {
				if(file.isFile()) {
					if(file.getName().endsWith(str)) {
						System.out.println(file.getName());
						count = 1;
					}
				}else {
					fileNum(file,str);
				}
			}
		}*/
		return count;
	}
	
	public static int fileNum1(File f, String str) {
		int count = 0;
	
		if(!f.exists()) {
			return 0;
		}
		
		if(f.isFile()) {
			if(f.getName().endsWith(str)) {
				System.out.println(f.getName());
				count++;
			}
		}else {
			File[] files = f.listFiles();
			for (File file : files) {
				fileNum1(file,str);
			}
		}
		return count;
	}
}
