package com.itheima;

import java.util.Scanner;

/*
 * 撰写一个方法，传入一个整数，返回这个整数的有效位
 * */
public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("请输入一个整数：");
		int n = sc.nextInt();
		
		int num = getLeng(n);
		System.out.println("num:"+num);
	}
	
	public static int getLeng(int n){
		int count = 0;
		
		if(n<0){
			n *= -1;
		}
		
		while(true){
			
			
			if(n>0 && n<10){
				count++;
				return count;
			}
			
			n /= 10;
			count++;
		}
	}

}
