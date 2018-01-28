package com.file;

import java.io.File;

/*
 * File:文件和目录路径名的抽象表示形式，File 类的实例是不可变的
 * 
 * 构造方法：
 * 		File(File parent, String child) 
 * 		File(String pathname) 
 * 		File(String parent, String child) 
 * 
 * File的常用功能：
 * 		创建功能
 * 			boolean createNewFile()  
 * 			boolean mkdir()  
 * 			boolean mkdirs()  
 * 		删除功能
 * 			boolean delete() 

 * 		获取功能
 * 			File getAbsoluteFile()  
 * 			String getAbsolutePath() 
 * 			String getName()  
 * 			String getParent()  
 * 			File getParentFile() 
 * 			String getPath()  
  			long lastModified() 
  			long length()  
 * 		判断功能
 * 			 boolean exists()  
 * 			 boolean isAbsolute()  
 * 			 boolean isDirectory() 
 			 boolean isFile()  
 			 boolean isHidden()  
 		修改文件名：
 			boolean renameTo(File dest)  
 *
 */
public class FileDemo1 {

	public static void main(String[] args) {
		//File(File parent, String child) 
//		File file2 = new File(new File("D:\\eclipse练习\\exc"),"a.txt");
		
		//File(String pathname) 
//		File file = new File("D:\\eclipse练习\\exc\\a.txt");
		
		//File(String parent, String child) 
		File file1 = new File("D:\\eclipse练习\\exc","a.txt");
		
	}

}
