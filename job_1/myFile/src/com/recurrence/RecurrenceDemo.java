package com.recurrence;

import java.io.File;

/*
 * �������ָ��Ŀ¼�����е�java�ļ�����������Ŀ¼��
 * */
public class RecurrenceDemo {

	public static void main(String[] args) {
		File f = new File("src");
		//File f = new File("src\\com\\file\\FileDemo1");
		
		method(f);
	}
	
	public static void method(File file) {
		//��ǿ��׳�ԣ��ж��Ƿ����ļ���
		if(file.isDirectory()) {
			File[] falis = file.listFiles();
			
			for (File f : falis) {
				//�ж��Ƿ����ļ�����
				if(f.isFile()) {
					if(f.getName().endsWith(".java")) {
						System.out.println(f.getName());
					}
				}else {
					//��һ��Ŀ¼����
					method(f);
				}
			}
		}
	}
	//���ָ��Ŀ¼�����е�java�ļ�������������Ŀ¼��
	public static void method1(File file) {
		if(file.isDirectory()) {
			File[] falis = file.listFiles();
			
			for (File f : falis) {
				if(f.isFile()) {
					if(f.getName().endsWith(".java")) {
						System.out.println(f.getName());
					}
				}
			}
		}
		
	}

}
