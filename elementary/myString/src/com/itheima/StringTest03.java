package com.itheima;

import java.util.Scanner;

/*
 * 键盘录入一个字符串，把该字符串的首字母转换成大写其余的伪小写。（只考虑英文的大小写字符）
 * 
 * 
 * */
public class StringTest03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("请输入英文:");
		String s = sc.nextLine();
		
//		String s3 = s.substring(0, 1);
//		String s4 = s.substring(1, s.length());
		
		String s1 = s.substring(0, 1).toUpperCase();
		String s2 = s.substring(1, s.length()).toLowerCase();
		//System.out.println(s2);
		System.out.println(s1+s2);
	}

}
