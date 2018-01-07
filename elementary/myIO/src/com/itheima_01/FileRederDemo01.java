package com.itheima_01;
/*
 * ���󣺴��ļ��ж����ݲ���ʾ������̨
 * 		������--������--FileReader
 * 
 * FileReader:
 * 		FileReader(String fileName):�����ļ�����
 * 
 * ���������ļ��Ĳ��裺
 * 		A:��������������
 * 		B:��������������Ķ����ݷ���
 * 		C:�ͷ���Դ
 * 
 * java.io.FileNotFoundException: fr.txt (ϵͳ�Ҳ���ָ�����ļ���)
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRederDemo01 {

	public static void main(String[] args) throws IOException {
		// FileReader fr = new FileReader("fr.txt");
		FileReader fr = new FileReader("FileWriterDemo.java");

		// ��������������Ķ����ݷ���
		/*
		 * //��read()���� //��һ�ζ�ȡ���� int ch = fr.read(); System.out.println(ch);
		 * System.out.println((char)ch);
		 * 
		 * //�ڶ��ζ�ȡ���� ch = fr.read(); System.out.println(ch);
		 * System.out.println((char)ch);
		 * 
		 * //�����ζ�ȡ���� ch = fr.read(); System.out.println(ch);
		 * System.out.println((char)ch);
		 * 
		 * //���Ĵζ�ȡ���� ch = fr.read(); System.out.println(ch);
		 * 
		 * //����ζ�ȡ���� ch = fr.read(); System.out.println(ch);
		 */

		int ch;
		while ((ch = fr.read()) != -1) {
			// System.out.println(ch);
			// System.out.println((char)ch);
			System.out.print((char) ch);
		}

		fr.close();

	}

}
