package com.itheima;

import java.util.Scanner;

/*
 * ����¼��һ���ַ������Ѹ��ַ���������ĸת���ɴ�д�����αСд����ֻ����Ӣ�ĵĴ�Сд�ַ���
 * 
 * 
 * */
public class StringTest03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������Ӣ��:");
		String s = sc.nextLine();
		
//		String s3 = s.substring(0, 1);
//		String s4 = s.substring(1, s.length());
		
		String s1 = s.substring(0, 1).toUpperCase();
		String s2 = s.substring(1, s.length()).toLowerCase();
		//System.out.println(s2);
		System.out.println(s1+s2);
	}

}
