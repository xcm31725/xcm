package com.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ʹ���ֽ��������ı��ļ�
 * 
 * ����Դ	src//com//file//FileDemo1.java 
 * Ŀ�ĵ�	FileDemo1.java
 * */
public class CopyFileDemo2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src//com//file//FileDemo1.java");
		FileOutputStream fos = new FileOutputStream("FileDemo.java");
		
		int ch;
		while((ch = fis.read()) != -1){
			fos.write(ch);
		}
		
		/*int len;
		byte[] byt = new byte[1024];
		while((len=fis.read(byt)) != -1){
			fos.write(byt,0,len);
		}*/
		
		fis.close();
		fos.close();
	}

}
