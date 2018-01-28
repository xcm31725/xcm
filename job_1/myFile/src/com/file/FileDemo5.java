package com.file;

import java.io.File;

/*
 * 	String[] list() 
 	File[] listFiles() 
 	static File[] listRoots() 
 */
public class FileDemo5 {

	public static void main(String[] args) {
		//method();
		
		//method1();
		
		File f = new File("c");
		File f1 = new File("D:");
		File f2 = new File("a.txt");
		
		//static File[] listRoots()
		
		File[] l = File.listRoots();
		
		for (File file : l) {
			System.out.println(file);
		}
	}

	private static void method1() {
		File f = new File("c");
		File f1 = new File("D:");
		File f2 = new File("a.txt");
		
		//File[] listFiles() 
		File[] files = f1.listFiles();
		
		for (File file : files) {
			System.out.println(file);
		}
	}

	private static void method() {
		File f = new File("c");
		File f1 = new File("D:");
		File f2 = new File("a.txt");
		
		//String[] list() 
		String[] file = f.list();
		
		for (int i = 0; i < file.length; i++) {
			System.out.println(file[i]);
		}
	}

}
