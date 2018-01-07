package com.itheima_02;
/*
 * ����
 * 		����Ŀ·���µ�FileWriterDemo.java�е����ݸ��Ƶ���Ŀ·���µ�Copy.java��
 * 
 * �ļ�����Ҳ���й��ɿ�ѭ�ģ�Ҳ����˵����·��
 * 
 * ����Դ��
 * 		FileWriterDemo.java -- ������ -- FileReader
 * Ŀ�ĵأ�
 * 		Copy.java -- д���� -- FileWriter
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDemo02 {

	public static void main(String[] args) throws IOException {
		// ����������
		FileReader fr = new FileReader("FileWriterDemo.java");
		// ���������
		FileWriter fw = new FileWriter("Copy2.java");

		// �����ַ�����
		char[] chs = new char[1024];
		int len;

		// ��д����
		while ((len = fr.read(chs)) != -1) {
			// System.out.print(new String(chs,0,len));
			fw.write(chs, 0, len);
		}

		// �ͷ���Դ
		fw.close();
		fr.close();

	}

}
