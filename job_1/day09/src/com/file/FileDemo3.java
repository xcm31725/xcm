package com.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDemo3 {

	public static void main(String[] args) throws IOException {
		//method1();
		method2();
		//method3();
		
		//method4();
	}

	private static void method4() {
		File f = new File("a.txt");
		File f1 = new File("b.txt");
		
		System.out.println(f.renameTo(f1));
	}

	private static void method3() {
		File f = new File("a.txt");
		File f1 = new File("c");
		File f2 = new File("D:\\APP");
		
		//System.out.println(f.getName());
		//System.out.println(f1.getName());
		//System.out.println(f2.getName());
		
		//System.out.println(f.getPath());
		//System.out.println(f1.getPath());
		//System.out.println(f2.getPath());
		
		//System.out.println(f.lastModified());
		//1516418828114
		//Date d = new Date(1516418828114L);
		//System.out.println(d.toLocaleString());
		
		//System.out.println(f1.lastModified());
		//System.out.println(f2.lastModified());
		
		System.out.println(f.length());
		System.out.println(f1.length());
	}

	private static void method2() throws IOException {
		//File f = new File("c","b");
		//File f1 = new File("a.txt");
		
		//File f3 = new File("c","b.txt");
		//System.out.println(f3.createNewFile());
		
		File parent = new File("b");
		File f4 = new File(parent,"c.txt");
		
		if(!parent.exists()) {
			parent.mkdirs();
		}
		System.out.println(f4.createNewFile());
		
		System.out.println(f4.getParent());
		//System.out.println(f3.getParent());
		
		//System.out.println(f.getParentFile());
		//System.out.println(f1.getParentFile());
	}

	private static void method1() {
		File f = new File("c");
		
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getAbsoluteFile());
	}

}
