package com.ithiema_01;

public class StringTest02 {

	public static void main(String[] args) {
		String s = "woaijava,zhenbang";
		int index = s.indexOf("java");//��ȡ�ַ�����һ�γ��ֵ�����
		String s1 = s.substring(0,index);//��ȡ�������Χ�ڵ��ַ���
		String s2 = s.substring(index+"java".length());//��ȡ�ӵڼ���������ʼ��
		
		System.out.println(s1+s2);

	}

}
