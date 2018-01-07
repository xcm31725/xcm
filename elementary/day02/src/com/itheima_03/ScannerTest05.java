package com.itheima_03;

import java.util.Scanner;

//闰年能被4整除而不能100整除   或者可以被400整除

public class ScannerTest05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("请输入一个年份：");
		
		int a = sc.nextInt();
		
		String str = (((a%4==0)&&(a/100!=0))||(a/400==0))?"润年":"平年";
		System.out.println("这个年份是："+str);

	}

}
