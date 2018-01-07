package com.itheima_02;

/*
 * if语句格式3：
 * 		if(关系表达式1) {
 * 			语句体1;
 * 		}else if(关系表达式2) {
 * 			语句体2;
 * 		}else if(关系表达式3) {
 * 			语句体3;
 * 		}
 * 		...
 * 		else {
 * 			语句体n+1;
 * 		}
 * 
 * 执行流程：
 * 		A:首先判断关系表达式1看其结果是true还是false
 * 		B:如果是true，就执行语句体1
 * 		     如果是false，就继续进行关系表达式2的判断看其结果是true还是false
 * 		C:如果是true，就执行语句体2
 * 		   如果是false，就继续进行关系表达式...的判断看其结果是true还是false
 * 		...
 * 		D:如果没有一个为true的，就执行语句体n+1
 * 
 * if语句的三种格式：
 * 		第一种格式适合做一种情况的判断
 * 		第二种格式适合做二种情况的判断
 * 		第三种格式适合做多种情况的判断
 */
public class IfDemo3 {
	public static void main(String[] args) {
		// x和y的关系满足如下：
		// x>=3 y = 2x + 1;
		// -1<=x<3 y = 2x;
		// x<=-1 y = 2x – 1;
		// 根据给定的x的值，计算出y的值并输出。

		// 定义变量
		int x = 5;
		
		/*
		int y;
		if (x >= 3) {
			y = 2 * x + 1;
		} else if (x >= -1 && x < 3) {
			y = 2 * x;
		} else if (x <= -1) {
			y = 2 * x - 1;
		}else {
			y = 0;
		}
		*/
		
		int y = 0;
		if (x >= 3) {
			y = 2 * x + 1;
		} else if (x >= -1 && x < 3) {
			y = 2 * x;
		} else if (x <= -1) {
			y = 2 * x - 1;
		}
		
		System.out.println("y的值是："+y);
	}
}
