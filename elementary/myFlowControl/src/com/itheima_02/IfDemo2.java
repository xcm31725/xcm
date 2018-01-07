package com.itheima_02;

/*
 * if语句格式2：
 * 		if(关系表达式) {
 * 			语句体1;
 * 		}else {
 * 			语句体2;
 * 		}
 * 
 * 执行流程：
 * 		A:判断关系表达式的值是true还是false
 * 		B:如果是true，就执行语句体1
 * 		C:如果是false，就执行语句体2
 */
public class IfDemo2 {
	public static void main(String[] args) {
		System.out.println("开始");
		// 判断给定的数据是奇数还是偶数
		// 定义变量
		int a = 100;
		// 给a重新赋值
		a = 99;

		if (a % 2 == 0) {
			System.out.println("a是偶数");
		} else {
			System.out.println("a是奇数");
		}

		System.out.println("结束");
	}
}
