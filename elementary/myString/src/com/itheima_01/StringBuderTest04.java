package com.itheima_01;

import java.util.Scanner;

/*
 * �ж�һ���ַ����Ƿ�Գ�
 * ����"abc"���ǶԳ��ַ�����"aba"��"abba"��"aaa"��"mnanm"�ǶԳ��ַ���
 * */
public class StringBuderTest04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ���ַ�����");
		String s = sc.nextLine();
		
		boolean boo = isSymmetry(s);
		System.out.println(boo);
	}

	public static boolean isSymmetry(String s){
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String result = sb.toString();
		/*if(result.equals(s)){
			return true;
		}else{
			return false;
		}*/
		return result.equals(s);
	}
}
