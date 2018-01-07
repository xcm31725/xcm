package com.itheima02;

import java.util.Scanner;

/*
 * 	提示用户控制台输入一个长度大于等于10的字符串，完成以下要求
	判断字符串长度，若用户输入的字符串长度小于10，则提示输入不合法，并结束程序；
	若字符串长度合法，取出字符串中索引3-9位置上的字符（包含3和9），
	统计截取后新的字符串中字母的个数（大写字母和小写字母都算），将统计出来的结果打印到控制台上

 * */
public class StringTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入长度大于等于10的字符串：");
		String s = sc.nextLine();
		
		int count = 0;
		if(s.length()<10){
			System.out.println("不合法");
		}else{
			String s1 = s.substring(3, 10);
			for(int i=0;i<s1.length();i++){
				if((s1.charAt(i)>='a'&&s1.charAt(i)<='z')||(s1.charAt(i)>='A')&&s1.charAt(i)<='Z'){
					System.out.println(s.charAt(i));
					count++;
				}
			}
		}
		
		System.out.println(count);
		
	}

}
