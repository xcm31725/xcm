package com.itheima_04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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
public class CopyDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("FileWriterDemo.java"));

		BufferedWriter bw = new BufferedWriter(new FileWriter("Copy4.java"));

		String line;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		br.close();
		bw.close();
	}
}
