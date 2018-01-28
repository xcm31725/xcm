package com.recurrence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求：将制定目录（包含内容）复制到另一个目录中
 * 
 * 源目录		目标目录
 * 
 * 分析：
 * 		首先我们要获取源目录下所有的文件和字目录，
 * 			我们可以把源目录封装成一个File对象，
 * 			我们可以调用File类listFile（）方法
 * 			我们可以获取源目录下所有的文件和子目录对应的File对象
 * 		如果我们获取到的是文件
 * 			先在目标目录中创建该文件所对应的目录
 * 			进行文件的复制
 * 		如果我们获取到的是子目录
 * 			看看子目录下面是否还有其他的文件和更深层次的子目录
 * */
public class RecurrenceTest1 {

	public static void main(String[] args) throws IOException {
		File src = new File("D:\\eclipse练习\\就业班第一阶段\\myFile");
		File dest = new File("c");
		
		copyDir(src,dest);
	}
	
	public static void copyDir(File src,File dest) throws IOException {
		if(src.isDirectory() && dest.isDirectory()) {
			
			File newDir = new File(dest, src.getName());
			if(!newDir.exists()) {
				newDir.mkdir();
			}
			
			File[] files = src.listFiles();
			
			for (File file : files) {
				if(file.isFile()) {
					FileInputStream fis = new FileInputStream(file);
					FileOutputStream fos = new FileOutputStream(new File(newDir,file.getName()));
					
					int len;
					byte[] bys = new byte[1024];
					
					while((len = fis.read(bys)) != -1) {
						fos.write(bys, 0, len);
					}
					
					fis.close();
					fos.close();
					
				}else{
					copyDir(file, newDir);
				}
			}
		}
	}

}
