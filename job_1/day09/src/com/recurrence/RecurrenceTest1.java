package com.recurrence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class RecurrenceTest1 {
	public static void main(String[] args) throws IOException {
		File src = new File("C:\\Users\\sudong\\Desktop\\b");
		File dest = new File("C:\\Users\\sudong\\Desktop\\a");
		
		copyFileOrDir(src,dest);
	}
	
	public static void copyDir(File src, File dest) {
		if(src.isDirectory() && dest.isDirectory()) {
			
		}
	}
	
	//可以拷贝文件，也可以拷贝文集夹
	public static void copyFileOrDir(File src, File dest) throws IOException {
		//数据源或者目的地有一个不存在，直接结束方法
		if(!src.exists() || !dest.exists()) {
			return;
		} 
		//如果目的地是一个文件，直接结束方法
		if(dest.isFile()) {
			return;
		}
		
		File file = new File(dest, src.getName());//可能指向于一个文件，也可能指向一个文件夹
		
		if(src.isDirectory()) {//说明数据是一个文件夹
			file.mkdirs();
			//获取原文件夹下所有的文件和文件夹
			File[] files = src.listFiles();
			
			for (File f : files) {
				//子File对象到底是文件还是文件夹，不需要管他
				copyFileOrDir(f,file);
			}
		}else {
			//说明数据源是一个文件
			//不需要创建文件
			//直接拷贝
			FileInputStream fis = new FileInputStream(src);
			
			FileOutputStream fos = new FileOutputStream(file);
			
			int len;
			byte[] bys = new byte[1024];
			while((len = fis.read(bys)) != -1) {
				fos.write(bys, 0, len);
			}
			
			fis.close();
			fos.close();
		}
	}
}
