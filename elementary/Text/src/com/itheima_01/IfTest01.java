package com.itheima_01;

import java.util.Scanner;

public class IfTest01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入第一个数：");
		int a = sc.nextInt();
		System.out.print("请输入第二个数：");
		int b = sc.nextInt();
		System.out.print("请输入第三个数：");
		int c = sc.nextInt();
		
		if(a>b){
			if(a>c){
				System.out.println("最大值为："+a);
			}else{
				System.out.println("最大值为："+c);
			}
		}else{
			if(b>c){
				System.out.println("最大值为："+b);
			}else{
				System.out.println("最大值为："+c);
			}
		}
	}

}
