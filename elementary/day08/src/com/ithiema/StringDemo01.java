package com.ithiema;

import java.util.Scanner;

public class StringDemo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年龄：");
		int i = sc.nextInt();
		
		System.out.println("请输入你的姓名：");
		String s = sc.nextLine();
		
		System.out.println("s:"+s+" i"+i);
	}

}
