package com.itheima;
/*
 * String���ת�����ܣ�
 * char[] toCharArray():���ַ���ת��Ϊ�ַ�����
 * String toLowerCase():���ַ���ת��ΪСд�ַ���
 * String toUpperCase():���ַ���ת��Ϊ��д�ַ���
 * */
public class StingDemo03 {

	public static void main(String[] args) {
		String s = "abcde";
		
		//char[] toCharArray():���ַ���ת��Ϊ�ַ�����
		char[] chs = s.toCharArray();
		for(int i=0; i<chs.length; i++){
			System.out.println(chs[i]);//ͨ�����ַ���ת��Ϊ�ַ���������ַ���
		}
		System.out.println("--------------------");
		
		//String toLowerCase():���ַ���ת��ΪСд�ַ���
		System.out.println("HelloWorld".toLowerCase());
		//String toUpperCase():���ַ���ת��Ϊ��д�ַ���
		System.out.println("HelloWorld".toUpperCase());
	}

}
