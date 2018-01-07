package com.itheima;

import java.util.Scanner;

/*
 * 统计一个字符串中大写字母字符，小写字母字，数字字符出现的次数。（不考虑其他字符）
 * 
 * 字符判断	例如：
 	* ch>='A'&& ch<='Z';
 * */
public class StringTest12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个字符串：");
		String s = sc.nextLine();
		
		int shu = 0, da = 0, xiao = 0;
		
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			if((ch>='A')&&(ch<='Z')){
				da++;
			}else if((ch>='a')&&(ch<='z')){
				xiao++;
			}else if((ch>='0')&&(ch<='9')){
				shu++;
			}else{
				System.out.println("有不符合条件的字符"+ch);
			}
		}
		System.out.println("大写出现"+da+"次，"+"小写出现"+xiao+"次，"+"数字出现"+shu+"次");
	}

}
