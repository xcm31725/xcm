package com.ithiema_01;

public class StringDemo01 {

	public static void main(String[] args) {
		String s = "hello";
		String s1 = new String("hello");
		String s2 = "Hello";
		
		//�ж������ַ�����ֵ�Ƿ�������ִ�Сд
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println("--------------");
		
		//�ж������ַ�����ֵ�Ƿ���Ȳ����ִ�Сд
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println("--------------");
		
		//�ж��ַ��������Ƿ���str��ͷ
		System.out.println(s.startsWith("he"));
		System.out.println(s.startsWith("ll"));
		System.out.println("--------------");
		
		//�ж��ַ��������Ƿ���str����
		System.out.println(s.endsWith("he"));
		System.out.println(s.endsWith("ll"));
	}

}
