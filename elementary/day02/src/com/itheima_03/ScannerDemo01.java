package com.itheima_03;

import java.util.Scanner;

/*
 * Scanner使用步骤
 * 		A：导包
 * 			import java.util.Scanner;
 * 			类中的顺序：package > import > class
 * 		B：创建对象
 * 			Scanner sc = new Scanner(System.in);
 * 		C：接收数据
 * 			int a = sc.nextInt();
 * */

public class ScannerDemo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("请输入第一个数字：");
		int a = sc.nextInt();
		
		System.out.print("请输入第二个数字：");
		int b = sc.nextInt();
		
		System.out.print("请输入第三个数字：");
		int x = sc.nextInt();
		
		int temp = (a>b)?a:b;
		int max = (temp>x)?temp:x;
		
		System.out.println(max);
	}

}
