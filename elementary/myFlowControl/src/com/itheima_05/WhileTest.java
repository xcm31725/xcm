package com.itheima_05;
/*
 * 求1-100之和。
 * 练习：统计水仙花个数。
 */
public class WhileTest {
	public static void main(String[] args) {
		//回顾for循环实现
		
		/*
		//定义求和变量
		int sum = 0;
		//获取1-100之间的数据
		for(int x=1; x<=100; x++) {
			//累加
			sum += x;
		}
		System.out.println("1-100的和是："+sum);
		*/
		
		//while循环实现
		//定义求和变量
		int sum = 0;
		int x = 1;
		while(x<=100) {
			sum += x;
			x++;
		}
		System.out.println("1-100的和是："+sum);
	}
}
