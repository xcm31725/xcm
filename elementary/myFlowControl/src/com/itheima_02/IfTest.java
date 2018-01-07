package com.itheima_02;

import java.util.Scanner;

/*
 * 键盘录入两个数据，获取这两个数据的较大值
 * 
 * 分析：
 * 		A:看到键盘录入，我们就应该想到键盘录入的三步骤
 * 			导包，创建对象，接收数据
 * 		B:获取这两个数据的较大值，其实就是判断两个数据谁大，把大的输出就可以了。
 * 
 * 导包：
 * 		A:手动导包
 * 			import java.util.Scanner;
 * 		B:鼠标点击红色叉叉，自动生成
 * 		C:快捷键(推荐)
 * 			ctrl+shift+o
 */
public class IfTest {
	public static void main(String[] args) {
		//创建对象
		Scanner sc = new Scanner(System.in);
		
		//接收数据
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();
		
		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();
		
		//采用if语句格式2实现
		/*
		if(a>b){
			System.out.println("较大的值是："+a);
		}else {
			System.out.println("较大的值是："+b);
		}
		*/
		
		//拿到较大的值之后，我未必想直接输出，所以我们定义变量接收这个较大的值
		int max;
		if(a>b){
			max = a;
		}else {
			max = b;
		}
		//可能做其他的操作
		//max += 100;
		System.out.println("较大的值是："+max);
	}
}
