package com.itheima_01;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo02 {

	public static void main(String[] args) throws IOException {
		// ����������
		// FileReader fr = new FileReader("fr2.txt");
		FileReader fr = new FileReader("Copy.java");

		// ��������������Ķ����ݷ���
		// int read(char[] cbuf)��һ�ζ�ȡһ���ַ���������ݣ����ص���ʵ�ʶ�ȡ���ַ�����
		char[] chs = new char[1024];// ���������1024����������
		/*
		 * int len;
		 * 
		 * //��һ�ζ����� len = fr.read(chs); System.out.println("len:"+len);
		 * System.out.println(chs);
		 * 
		 * //�ڶ��ζ����� len = fr.read(chs); System.out.println("len:"+len);
		 * System.out.println(chs);
		 * 
		 * //�����ζ����� len = fr.read(chs); System.out.println("len:"+len);
		 * System.out.println(chs);
		 * 
		 * len = fr.read(chs); System.out.println("len:"+len);
		 * //System.out.println(chs);
		 * 
		 * len = fr.read(chs); System.out.println("len:"+len);
		 * //System.out.println(chs);
		 */

		int len;
		while ((len = fr.read(chs)) != -1) {
			// System.out.print(chs);
			System.out.print(new String(chs, 0, len));
		}

		fr.close();
	}

}
