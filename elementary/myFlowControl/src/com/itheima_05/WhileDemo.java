package com.itheima_05;
/*
 * while循环语句的基本格式：
 * 		while(判断条件语句) {
 * 			循环体语句;
 * 		}
 * 扩展格式：
 * 		初始化语句;
 * 		while(判断条件语句) {
 * 			循环体语句;
 * 			控制条件语句;
 * 		}
 * 
 * 回顾for循环的语句格式：
 * 		for(初始化语句;判断条件语句;控制条件语句) {
 * 			循环体语句;
 * 		}
 */
public class WhileDemo {
	public static void main(String[] args) {
		//输出10次HelloWorld
		/*
		for(int x=1; x<=10; x++) {
			System.out.println("HellloWorld");
		}
		*/
		
		//while循环实现
		int x=1;
		while(x<=10) {
			System.out.println("HellloWorld");
			x++;
		}
	}
}
