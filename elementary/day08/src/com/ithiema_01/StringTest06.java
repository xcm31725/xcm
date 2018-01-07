package com.ithiema_01;

import java.util.Scanner;

public class StringTest06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个字符串：");
		String s = sc.nextLine();
		
		//截取第一个字符
		String s1 = s.substring(0,1);
		
		//截取从第二个字符以后的字符
		String s2 = s.substring(1);
		
		//拼接第一个为大写，后面的为小写
		String s3 = s1.toUpperCase()+s2.toLowerCase();
		
		System.out.println("s3："+s3);
	}

}
