package com.itheima;

public class StringDemo02 {

	public static void main(String[] args) {
		String s = "helloworld";
		
		//int length():��ȡ�ַ����ĳ��ȣ���ʵ�����ַ�����
		System.out.println(s.length());
		System.out.println("-------------");
		
		//char charAt(int index):��ȡָ�����������ַ�
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println("-------------");
		
		//int indexOf(String str):��ȡstr���ַ��������һ�γ��ֵ�����
		System.out.println(s.indexOf("l"));
		System.out.println(s.indexOf("owo"));
		System.out.println(s.indexOf("xcm"));//�ַ�����û�����Ԫ��
		System.out.println("-------------");
		
		//String substring(int start):��start��ʼ��ȡ�ַ���
		System.out.println(s.substring(0));
		System.out.println(s.substring(5));
		System.out.println("-------------");
		
		//String substring(int start,int end):��start��ʼ,��end������ȡ�ַ���
		System.out.println(s.substring(0, s.length()));
		System.out.println(s.substring(3, 8));//ȡ��������[3,8)
	}

}
