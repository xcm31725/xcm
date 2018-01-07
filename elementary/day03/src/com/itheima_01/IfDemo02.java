package com.itheima_01;

/*
 * If的第二种格式
 * */

public class IfDemo02 {

	public static void main(String[] args) {
		System.out.println("开始");
		
		int a = 19;
		
		if(a%2==0){//if和三元运算符不能完全替代
			System.out.println("a是偶数");
		}else{
			System.out.println("a是奇数");
		}
		
		System.out.println("结束");
	}

}
