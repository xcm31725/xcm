package com.itheima_01;
//��ת�ַ�����ͨ��StringBuilder��ʵ��
import java.util.Scanner;

public class StringBuilderTset03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������һ���ַ���:");
		String s = sc.nextLine();
		
		String ss = myReverse(s);
		System.out.println(ss);
	}
	
	public static String myReverse(String s){
		//�Ȱ�Stringת����StringBuilder��ͨ��reverse()��ת���ٰ�StringBuilderת����String
		StringBuilder sb = new StringBuilder(s);
		
		sb.reverse();
		String result = sb.toString();
		return result;
	}

}
