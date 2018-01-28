package com.file;

import java.io.File;
import java.io.IOException;

/*
 * 	创建功能
 * 		boolean createNewFile()  
 * 		boolean mkdir()  
 * 		boolean mkdirs()  
 * 	删除功能
 * 		boolean delete() 
 * 
 *  绝对路径：固定不可改变的路径，以盘符开头
 *  相对路径：相对某个参照物，不能以盘符开头
 *  		在eclipse中相对路径相对应当前项目的根目录
 *  
 *  
 *  注意：删除一个文件夹，这个文件夹下面不能有其他的文件和文件
 * */
public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		//File f1 = new File("a.txt");
		//boolean createNewFile(): 当指定文件不存在时创建文件并返回true，否则返回false 
		//System.out.println(f1.createNewFile());
		
		//boolean mkdir(): 当指定文件夹不存在时创建文件夹并返回true，否则返回false
		//File f2 = new File("b");
		//System.out.println(f2.mkdirs());
		
		//boolean mkdirs() : 创建指定文件夹，当文件夹所在的目录不存在，则顺道一块创建了
		//File f3 = new File("a\\b\\c");
		//System.out.println(f3.mkdirs());
		
		File f4 = new File("b.txt");
		//System.out.println(f4.mkdir());
		
		//boolean delete() :当指定的文件或文件夹存在时删除文件或者文件夹 并返回true，否则返回false
		//System.out.println(f1.delete());
		//System.out.println(f3.delete());
		System.out.println(f4.delete());
		
	}

}
