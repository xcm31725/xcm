package com.itheima_01;

import java.util.Scanner;

/*
 * 判断一个字符串是否对称
 * 例如"abc"不是对称字符串，"aba"、"abba"、"aaa"、"mnanm"是对称字符串
 * */
public class StringBuderTest04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个字符串：");
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
