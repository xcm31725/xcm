package com.itheima_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * BufferedWriter:���ı�д���ַ����������������ַ����Ӷ��ṩ�����ַ���������ַ����ĸ�Чд�롣 
 * BufferedReader:���ַ��������ж�ȡ�ı�����������ַ����Ӷ�ʵ���ַ���������еĸ�Ч��ȡ��
 */
public class BufferedstareamDemo {

	public static void main(String[] args) throws IOException {
		// �����������������
		/*
		 * BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
		 * 
		 * bw.write("hello"); bw.flush(); bw.close();
		 */
		// �������뻺��������
		BufferedReader br = new BufferedReader(new FileReader("Copy.java"));

		/*
		 * //һ���ַ��Ķ�ȡ int ch; while((ch=br.read())!=-1){
		 * System.out.print((char)ch); }
		 */

		// һ���ַ����Ķ�ȡ
		char[] chs = new char[1024];
		int len;
		while ((len = br.read(chs)) != -1) {
			System.out.print(new String(chs, 0, len));
		}

		br.close();
	}

}
