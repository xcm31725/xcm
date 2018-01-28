package com.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 分别使用字符流和字节流复制图片
 * 
 * 二进制文件只能使用字节流进行复制（使用Windows自带记事本打开读不懂的）
 * 
 * 文本文件的赋值即可使用字符流，也可以使用字节流
 * */
public class CopyFileDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("传智学院.jpg");
		FileOutputStream fos = new FileOutputStream("D:\\传智学院.jpg");
		
		int n;
		byte[] bye = new byte[1024];
		
		while((n = fis.read(bye)) != -1){
			fos.write(bye, 0, n);
		}
		
		fis.close();
		fos.close();
		
		
	}

}
