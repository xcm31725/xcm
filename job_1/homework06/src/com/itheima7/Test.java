package com.itheima7;

import java.util.ArrayList;

/*
 * 7��ͳ�Ƽ�����Ԫ�ذ��������ַ����ַ����ĸ���
			����:  "a2bc"����ַ����Ͱ����������ַ�'2'
		ArrayList<String> list = new ArrayList<String>();
		list.add("robin");
		list.add("a1b2c3");
		list.add("java");
		list.add("abc123");
		list.add("hello");
		
		Ҫ��:ʹ�����ַ�ʽ���
		��ʾ:
			(1)ʹ�ô�ͳ��ʽ
				��ȡ��ÿһ��Ԫ��(�ַ���),�����ַ���,�õ�ÿһ���ַ�,�жϸ��ַ��Ƿ��������ַ�
			(2)ʹ��������ʽ
 * */
public class Test {

	public static void main(String[] args) {
		//arrayPrint();
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("robin");
		list.add("a1b2c3");
		list.add("java");
		list.add("abc123");
		list.add("hello");
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			if(s.matches(".*[0-9].*")){
				count++;
			}
		}
		System.out.println(count);
	}

	private static void arrayPrint() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("robin");
		list.add("a1b2c3");
		list.add("java");
		list.add("abc123");
		list.add("hello");
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			for(int j=0;j<s.length();j++){
				if(s.charAt(j)>='0'&&s.charAt(j)<='9'){
					count++;
					break;
				}	
			}
		}
		System.out.println(count);
	}

}
