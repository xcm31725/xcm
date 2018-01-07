package com.ithiema_01;

import java.util.Scanner;

public class StringTest04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String s = sc.nextLine();
		
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch<='Z' && ch>='A'){
				bigCount++;
			}else if(ch<='z' && ch>='a'){
				smallCount++;
			}else if(ch<='9' && ch>='0'){
				numberCount++;
			}else{
				System.out.println("你输入的字符"+ch+"非法");
			}
		}
		System.out.println("大写字母的是"+bigCount+"个");
		System.out.println("小写字母的是"+smallCount+"个");
		System.out.println("数字是"+numberCount+"个");

	}

}
