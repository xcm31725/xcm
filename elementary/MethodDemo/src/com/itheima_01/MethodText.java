package com.itheima_01;

import java.util.Scanner;

public class MethodText {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入第一个值：");
		int a = s.nextInt();
		System.out.println("请输入第二个值");
		int b = s.nextInt();
		System.out.println("请输入第三个值");
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
