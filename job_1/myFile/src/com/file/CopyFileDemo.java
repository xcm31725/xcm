package com.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ֱ�ʹ���ַ������ֽ�������ͼƬ
 * 
 * �������ļ�ֻ��ʹ���ֽ������и��ƣ�ʹ��Windows�Դ����±��򿪶������ģ�
 * 
 * �ı��ļ��ĸ�ֵ����ʹ���ַ�����Ҳ����ʹ���ֽ���
 * */
public class CopyFileDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("����ѧԺ.jpg");
		FileOutputStream fos = new FileOutputStream("D:\\����ѧԺ.jpg");
		
		int n;
		byte[] bye = new byte[1024];
		
		while((n = fis.read(bye)) != -1){
			fos.write(bye, 0, n);
		}
		
		fis.close();
		fos.close();
		
		
	}

}
