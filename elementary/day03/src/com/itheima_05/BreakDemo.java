package com.itheima_05;

import java.util.Scanner;
/*
 * 不知道多少次的时候用while循环
 * 循环的高级用法，语句的跳转，跳转到之前的某一位置
 * break结束循环体
 * */
public class BreakDemo {

	public static void main(String[] args) {
		/*for(int a=1;a<=10;a++){
			if(a == 3){
				break;
			}//两次
			System.out.println("HelloWorld!");
			//if(a == 3){
				//break;
		//	}//三次
		}
		
		*/
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("请输入你的成绩：");
			int a = sc.nextInt();
			
			if(a>=0&&a<+100){
				System.out.println("成绩合法");
				break;
			}else{
				System.out.println("成绩不合法");
			}
		}
	}

}
