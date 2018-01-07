package com.itheima;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("请输入月份（1~12）月之间:");
//		int n = sc.nextInt();
		
		while(true){
			System.out.print("请输入月份（1~12）月之间:");
			int n = sc.nextInt();
			
			switch(n){
			case 1:
			case 2:
			case 12:
				System.out.println("冬季");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋季");
				break;
			default:
				System.out.print("你输入的月份有误,清从新输入:");
				
			}
		}
		
	}

}
