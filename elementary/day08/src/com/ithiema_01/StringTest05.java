package com.ithiema_01;

public class StringTest05 {

	public static void main(String[] args) {
		String s = "name";
		char[] chs = s.toCharArray();//ת�����ַ�����
		
		for (int i = 0; i < chs.length; i++) {
			System.out.println(chs[i]);
		}
		
		//�Ѵ�дת����Сд
		System.out.println("HelloWorld".toLowerCase());
		//��Сдת������д
		System.out.println("HelloWorld".toUpperCase());
	}

}
