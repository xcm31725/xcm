package com.itheima_01;

import java.util.Scanner;

public class IfTest01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������һ������");
		int a = sc.nextInt();
		System.out.print("������ڶ�������");
		int b = sc.nextInt();
		System.out.print("���������������");
		int c = sc.nextInt();
		
		if(a>b){
			if(a>c){
				System.out.println("���ֵΪ��"+a);
			}else{
				System.out.println("���ֵΪ��"+c);
			}
		}else{
			if(b>c){
				System.out.println("���ֵΪ��"+b);
			}else{
				System.out.println("���ֵΪ��"+c);
			}
		}
	}

}
