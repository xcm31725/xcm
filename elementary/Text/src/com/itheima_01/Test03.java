package com.itheima_01;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入成绩：");
		int a = sc.nextInt();
		
		if((a>90) && (a<=100)){
			System.out.println("优秀");
		}else if((a>80) && (a<=90)){
			System.out.println("好");
		}else if((a>70) && (a<=80)){
			System.out.println("良");
		}else if((a>=60) && (a<=70)){
			System.out.println("及格");
		}else if((a>=0) && (a<60)){
			System.out.println("不及格");
		}else{
			System.out.println("你输入的不合法");
		}
	}

}
