package com.regex;
/*
 * �ַ���"���ǲ�����һ����ʦ��JavaSE,�����Ƿ�����,�����ر���,��Ҫ����˵����,������,������,������";
 * ��������ַ����е�"������"�滻Ϊ"***"
 * 
 * replaceAll(String regex, String replacement) :ʹ�ø����� replacement �滻���ַ�������ƥ�������������ʽ�����ַ�����
 * String replaceFirst(String regex, String replacement) :ʹ�ø����� replacement �滻���ַ���ƥ�������������ʽ�ĵ�һ�����ַ�����
 * 
 * */
public class RegexTest1 {

	public static void main(String[] args) {
		String str = "���ǲ�����һ����ʦ��JavaSE,�����Ƿ�����,�����ر���,��Ҫ����˵����,������,������,������";
		String replaceAllStr = str.replaceAll("������", "***");
		System.out.println(replaceAllStr);
	}

}
