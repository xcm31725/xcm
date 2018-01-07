package com.itheima_03;

import java.util.*;

public class ScannerTest04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.err.print("请输入一个数：");
		
		int a = sc.nextInt();
		
		String str = (a%2==0)?"偶数":"奇数";
		
		System.out.println("这个数为："+str);

	}

}
