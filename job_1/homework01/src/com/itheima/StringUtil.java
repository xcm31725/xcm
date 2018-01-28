package com.itheima;
/*
 * (1),����һ������ boolean isEmpty(String str),�жϸ����ַ����Ƿ���null����""
			��������ַ�����null,����true
			��������ַ�����"",����true
			���򷵻�false
		(2),����һ������ boolean equals(String str1, String str2),�жϸ������ַ����Ƿ����
			���str1��str2����null�Ļ�,����true
			���str1��str2��������ͬ,����true
			���򷵻�false
		��ʾ:�����������еķ�����Ӧ���Ǿ�̬��
			���췽��Ӧ��˽��,������紴������
 * */
public class StringUtil {
	private StringUtil(){}
	
	public static boolean isEmpty(String str){
		if((str == null)||(str == "")){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean equals(String str1, String str2){
		if(((str1 == null)&&(str2 == null))||(str1 == str2)){
			return true;
		}else{
			return false;
		}
	}
}
