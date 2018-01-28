package com.recurrence;

import java.io.File;

/*
 * 需求：删除指定的目录（包含子目录）
 * 
 * 注意：如果要删除一个目录，则需要先删除这个目录下所有的文件和字目录
 * */
public class RecurrenceDemo1 {

	public static void main(String[] args) {
		File f = new File("D:\\eclipse练习\\exc");
		
		method(f);
	}
	
	//删除指定目录下所有文件目录
	public static void method(File file) {
		if(file.isDirectory()) {
			//干掉自己所有的文件和子目录
			//获取所有的子文件和目录
			File[] files = file.listFiles();
			
			for (File  f: files) {
				if(f.isFile()) {
					//直接干掉
					System.out.println(f.getName());
					f.delete();
				}else {
					//继续查看是否还有文件和子目录
					method(f);
				}
			}
		}
		
		//干掉自己
		file.delete();
	}

}
