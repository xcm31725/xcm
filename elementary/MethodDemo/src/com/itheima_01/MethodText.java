package com.itheima_01;

import java.util.Scanner;

public class MethodText {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�������һ��ֵ��");
		int a = s.nextInt();
		System.out.println("������ڶ���ֵ");
		int b = s.nextInt();
		System.out.println("�����������ֵ");
		int c = s.nextInt();
		
		int result = add(a,b,c);
		System.out.println(result);
	}

	public static int add(int a, int b, int c){
		if(a>b){
			if(a>c){
				return a;
			}else{
				return c;
			}
		}else{
			if(b>c){
				return b;
			}else{
				return c;
			}
		}
	}
}
