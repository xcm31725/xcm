package com.recurrence;

import java.io.File;

public class RecurrenceDemo1 {

	public static void main(String[] args) {
		File f = new File("src");
		//show(f);
		method(f);
	}
	
	public static void method(File file) {
		if(!file.exists()){
			return;
		}
		
		if(file.isFile()){
			if(file.getName().endsWith(".java")) {
				System.out.println(file.getName());
			}
		}else {
			File[] files = file.listFiles();
			for (File f : files) {
				method(f);
			}
		}
		
	}
	
	public static void show(File file) {
		if(file.isDirectory()) {
			
			File[] files = file.listFiles();
			for (File f : files) {
				if(f.isFile()){
					if(f.getName().endsWith(".java")){
						System.out.println(f.getName());
					}
				}else {
					show(f);
				}
			}
		}
	}
	
	public static void show1(File file) {
		if(file.isDirectory()) {
			
			File[] files = file.listFiles();
			for (File f : files) {
				if(f.isFile()){
					if(f.getName().endsWith(".java")){
						System.out.println(f.getName());
					}
				}
			}
		}
	}

}
