package com.itheima06;

import java.util.Scanner;

/*
 * 2.提示用户控制台输入一个长度大于等于10的字符串，完成以下要求（10分）
	判断字符串长度，若用户输入的字符串长度小于10，则提示输入不合法，并结束程序；
	若字符串长度合法，取出字符串中索引3-9位置上的字符（包含3和9），
	统计截取后新的字符串中字母的个数（大写字母和小写字母都算），将统计出来的结果打印到控制台上

 * */
public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个字符串：");
		String s = sc.nextLine();
		
		int count = 0;
		if(s.length()<10){
			System.out.println("输入不合法");
		}else{
			String str = s.substring(3, 10);
			for(int i=0;i<str.length();i++){
				if((str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='a'&&str.charAt(i)<='z')){
					count++;
				}
			}
			
		}
		
		System.out.println(count);

	}

}
