package com.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/*
 *	获取功能
 		File getAbsoluteFile()  
 * 		String getAbsolutePath() 
 * 		String getParent()  
 * 		File getParentFile() 
 * 		String getName() 
 * 		String getPath()  
  		long lastModified() 
  		long length() 
  	修改功能：
 		boolean renameTo(File dest)
 */
public class FileDemo4 {

	public static void main(String[] args) throws IOException {
		//method();
		//method1();
		//method2();
		
		File f = new File("D:\\eclipse练习\\exc.a.txt");
		File f1 = new File("c\\a.txt");
		
		//boolean renameTo(File dest): 将当前File对象所指向的路径 修改为 指定File所指向的路径
		//注意：修改的文件路径不能存在，如果存在则修改失败
		System.out.println(f.renameTo(f1));
	}

	private static void method2() {
		File f = new File("a.txt");
		File f1 = new File("D:\\eclipse练习\\exc.a.txt");
		File f2 = new File("c");
		
		//String getName()  : 获取文件和文件夹的名称
		//System.out.println(f.getName());
		//System.out.println(f1.getName());
		//System.out.println(f2.getName());
		
		//String getPath() : 返回创建File对象时给的路径
		//System.out.println(f.getPath());
		//System.out.println(f1.getPath());
		//System.out.println(f2.getPath());
		
		//long lastModified():以毫秒值的形式返回最后修改时间 
		//System.out.println(f.lastModified());
		
		//Date d = new Date(1516366405993L);
		//System.out.println(d.toLocaleString());
		
		//long length(): 返回文件的字节数
		System.out.println(f.length());
	}

	private static void method1() {
		//File f = new File("b");
		//File f1 = new File("c","a.txt");
		//System.out.println(f1.createNewFile());
		
		File parent = new File("c");
		File f2 = new File(parent,"c.txt");
		if(!parent.exists()){
			parent.mkdirs();
		}
		//String getParent()  
		System.out.println(f2.getParent());
		//File getParentFile() 
		System.out.println(f2.getParentFile());
	}

	private static void method() {
		File f = new File("b");
		File f1 = new File("D:\\eclipse练习\\exc.a.txt");
		
		//File getAbsoluteFile() ：以File对象的形式返回当前File对象所有指向的绝对路径
		System.out.println(f1.getAbsoluteFile());
		//String getAbsolutePath() : 返回File对象所指向的绝对路径
		System.out.println(f1.getAbsolutePath());
	}

}
