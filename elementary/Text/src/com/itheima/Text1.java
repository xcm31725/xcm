package com.itheima;

import java.util.Scanner;

public class Text1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入你的月份(1~12)：");
		int month = s.nextInt();
		
		if(month >= 3 && month <= 6){
			System.out.println("春天");
		}else if(month >=7 && month <= 9){
			System.out.println("夏天");
		}else if(month >= 10 && month <= 11){
			System.out.println("秋天");
		}else if(month == 12 && month <= 2){
			System.out.println("冬天");
		}
		
	}
}
