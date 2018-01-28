package com.recurrence;

import java.io.File;

/*
 * 需求：输出指定目录下所有的java文件名（包含子目录）
 * */
public class RecurrenceDemo {

	public static void main(String[] args) {
		File f = new File("src");
		//File f = new File("src\\com\\file\\FileDemo1");
		
		method(f);
	}
	
	public static void method(File file) {
		//加强健壮性，判断是否是文件夹
		if(file.isDirectory()) {
			File[] falis = file.listFiles();
			
			for (File f : falis) {
				//判断是否是文件对象
				if(f.isFile()) {
					if(f.getName().endsWith(".java")) {
						System.out.println(f.getName());
					}
				}else {
					//是一个目录对象
					method(f);
				}
			}
		}
	}
	//输出指定目录下所有的java文件名（不包含子目录）
	public static void method1(File file) {
		if(file.isDirectory()) {
			File[] falis = file.listFiles();
			
			for (File f : falis) {
				if(f.isFile()) {
					if(f.getName().endsWith(".java")) {
						System.out.println(f.getName());
					}
				}
			}
		}
		
	}

}
