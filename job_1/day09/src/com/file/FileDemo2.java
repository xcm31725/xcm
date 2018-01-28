package com.file;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		//method1();
		//method2();
		//method3();
		
		File f = new File("c");
		System.out.println(f.isHidden());
	}

	private static void method3() {
		File f = new File("a.txt");
		File f1 = new File("c");
		
		//System.out.println(f.isDirectory());
		//System.out.println(f1.isDirectory());
		
		System.out.println(f.isFile());
		System.out.println(f1.isFile());
	}

	private static void method2() {
		File f = new File("c");
		System.out.println(f.isAbsolute());
	}

	private static void method1() throws IOException {
		File f = new File("a.txt");
		f.createNewFile();
		
		System.out.println(f.exists());
	}

}
