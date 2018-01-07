package com.itheima_01;
//反转字符串，通过StringBuilder来实现
import java.util.Scanner;

public class StringBuilderTset03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("请输入一个字符串:");
		String s = sc.nextLine();
		
		String ss = myReverse(s);
		System.out.println(ss);
	}
	
	public static String myReverse(String s){
		//先把String转换成StringBuilder在通过reverse()反转，再把StringBuilder转换成String
		StringBuilder sb = new StringBuilder(s);
		
		sb.reverse();
		String result = sb.toString();
		return result;
	}

}
