package com.itheima_03;

import java.util.Scanner;

public class ScannerTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������һ�����֣�");
		int a = sc.nextInt();
		
		System.out.print("������ڶ������֣�");
		int b = sc.nextInt();

		boolean falg = (a==b);
		System.out.println("falg:"+falg);
	}

}
