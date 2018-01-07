package com.itheima04;

import java.util.Scanner;

/*
 * 1.	请将学生的成绩按照等级划分出来：(请运用键盘录入)（8分）
	学习成绩>=90的同学用A表示。
	60-89之间的用B表示。
	60分以下的用C表示。

 * */
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩：");
		int n = sc.nextInt();
		if(n<0||n>100){
			System.out.println("你输入的有误");
		}else{
			if(n>=90){
				System.out.println("A");
			}else if(n>=60){
				System.out.println("B");
			}else{
				System.out.println("C");
			}
			
		}
	}

}
