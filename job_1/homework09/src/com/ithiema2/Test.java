package com.ithiema2;

import java.io.File;

/*
 * 2��ͳ��ָ���ļ��еĴ�С
		����:
			1,����һ������,����File f
			2,����һ����ͱ���,�����ۼ������ļ��Ĵ�С
			3,�ж��Ƿ����ļ���
				�����,����
				�������,�˳�
			4,��ȡ��ǰĿ¼�����е��ļ��Լ��ļ���
			5,����,�õ�ÿһ��File����,�ж��Ƿ����ļ�
				�����,�����ļ��Ĵ�С�ۼӵ���ͱ�����
				�������,���÷���(�Լ�)
 * */
public class Test {

	public static void main(String[] args) {
		File f = new File("a");
		System.out.println(show(f));
	}
	
	public static long show(File file) {
		long sum = 0;
		
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f : files) {
				sum += show(f);
			}
		}else {
			sum = file.length();
		}
		return sum;
	}
}
