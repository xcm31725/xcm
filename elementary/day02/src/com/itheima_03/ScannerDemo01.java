package com.itheima_03;

import java.util.Scanner;

/*
 * Scannerʹ�ò���
 * 		A������
 * 			import java.util.Scanner;
 * 			���е�˳��package > import > class
 * 		B����������
 * 			Scanner sc = new Scanner(System.in);
 * 		C����������
 * 			int a = sc.nextInt();
 * */

public class ScannerDemo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������һ�����֣�");
		int a = sc.nextInt();
		
		System.out.print("������ڶ������֣�");
		int b = sc.nextInt();
		
		System.out.print("��������������֣�");
		int x = sc.nextInt();
		
		int temp = (a>b)?a:b;
		int max = (temp>x)?temp:x;
		
		System.out.println(max);
	}

}
