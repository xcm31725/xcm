package com.recurrence;

import java.io.File;

/*
 * ����ɾ��ָ����Ŀ¼��������Ŀ¼��
 * 
 * ע�⣺���Ҫɾ��һ��Ŀ¼������Ҫ��ɾ�����Ŀ¼�����е��ļ�����Ŀ¼
 * */
public class RecurrenceDemo1 {

	public static void main(String[] args) {
		File f = new File("D:\\eclipse��ϰ\\exc");
		
		method(f);
	}
	
	//ɾ��ָ��Ŀ¼�������ļ�Ŀ¼
	public static void method(File file) {
		if(file.isDirectory()) {
			//�ɵ��Լ����е��ļ�����Ŀ¼
			//��ȡ���е����ļ���Ŀ¼
			File[] files = file.listFiles();
			
			for (File  f: files) {
				if(f.isFile()) {
					//ֱ�Ӹɵ�
					System.out.println(f.getName());
					f.delete();
				}else {
					//�����鿴�Ƿ����ļ�����Ŀ¼
					method(f);
				}
			}
		}
		
		//�ɵ��Լ�
		file.delete();
	}

}
