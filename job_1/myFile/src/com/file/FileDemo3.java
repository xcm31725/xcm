package com.file;

import java.io.File;
import java.io.IOException;

/*
 *	判断功能
 * 		boolean exists()  
 * 		boolean isAbsolute()  
 * 		boolean isDirectory() 
 		boolean isFile()  
 		boolean isHidden() 
 */
public class FileDemo3 {

	public static void main(String[] args) throws IOException {
		//method();
		//method1();
		//method2();
		File f = new File("D:\\eclipse练习\\exc.a.txt");
		//boolean isHidden()  :判断File对象指向的路径是否有隐藏属性，如果隐藏了则返回true，否则返回false
		System.out.println(f.isHidden());
	}

	private static void method2() {
		File f = new File("a.txt"); 
		File f1 = new File("b"); 
		//boolean isDirectory()：判断File对象指向的路径是否是文件夹，如果是则返回true，否则返回false 
		//System.out.println(f.isDirectory());
		//System.out.println(f1.isDirectory());
		
 		//boolean isFile() : 判断File对象指向的路径是否是文件，如果是则返回true，否则返回false 
		System.out.println(f.isFile());
		System.out.println(f1.isFile());
	}

	private static void method1() {
		File f = new File("D:\\eclipse练习\\exc.a.txt");
		//boolean isAbsolute()  :判断File对象指向的路径是否是绝对路径，如果是绝对路径则返回true，否则返回false
		System.out.println(f.isAbsolute());
	}

	private static void method() throws IOException {
		//boolean exists(): 判断文件或者文件夹是否存在，如果存在则返回true，否则返回false
		File f = new File("a.txt");
		f.createNewFile();
		System.out.println(f.exists());
	}

}
