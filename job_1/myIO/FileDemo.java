package com.file;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		File f = new File("a");
		//System.out.println(f.createNewFile());
		
		/*File f2 = new File("a.txt");
		System.out.println(f.createNewFile());*/
		
		//File f3 = new File("b");
		//System.out.println(f3.mkdir());
		
		//File f4 = new File("c\\b\\a");
		//System.out.println(f4.mkdirs());
		
		//File f5 = new File("a.txt");
		//System.out.println(f5.mkdirs());
		
		//System.out.println(f5.delete());
		//System.out.println(f4.delete());
		//System.out.println(f3.delete());
		System.out.println(f.delete());
	}

}
