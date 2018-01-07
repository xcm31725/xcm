package com.itheima;

import java.util.Scanner;

public class MainAPP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入5-12位数字：");
		long n = sc.nextInt();
		
		checkQQ(n);
	}
	
	public static void checkQQ(long s){
		if(s>=10000 && s<1000000000000l){
			System.out.println("验证成功！");
		}else{
			System.out.println("你输入的有误！");
		}
	}

}
