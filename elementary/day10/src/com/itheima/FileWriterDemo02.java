package com.itheima;

import java.io.FileWriter;
import java.io.IOException;

/*
 * void write(String str):дһ���ַ�������
 * void write(String str,int index,int len):дһ���ַ����е�һ��������
 * void write(int ch):дһ���ַ�����,����дint���͵ĺô��Ǽȿ���дchar���͵����ݣ�Ҳ����дchar��Ӧ��int���͵�ֵ��'a',97
 * void write(char[] chs):дһ���ַ���������
 * void write(char[] chs,int index,int len):дһ���ַ������һ��������
 */
public class FileWriterDemo02 {

	public static void main(String[] args) throws IOException {
		// ����д�����
		FileWriter fw = new FileWriter("a.txt");

		// void write(String str):дһ���ַ�������
		// fw.write("abcde");

		// void write(String str,int index,int len):дһ���ַ����е�һ��������
		// fw.write("abcde", 1, 2);

		// void write(int
		// ch):дһ���ַ�����,����дint���͵ĺô��Ǽȿ���дchar���͵����ݣ�Ҳ����дchar��Ӧ��int���͵�ֵ��'a',97
		// fw.write('a');
		// fw.write(98);

		// void write(char[] chs):дһ���ַ���������
		char[] arr = { 'a', 'b', 'c', 'd', 'e' };
		// fw.write(arr);

		// void write(char[] chs,int index,int len):дһ���ַ������һ��������
		fw.write(arr, 1, 3);

		// �ͷ���Դ
		fw.close();
	}

}
