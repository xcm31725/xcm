package com.itheima;
/*
 * 方法的参数如果是基本数据类型：形式参数的改变不影响实际参数。
 * 
 * 形式参数：用于接收实际参数的变量
 * 实际参数：实际参与运算的变量（量）
 * */
public class ArgsDemo01 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("a:"+a+", b:"+b);//a=10,b=20
		change(a,b);
		System.out.println("a:"+a+", b:"+b);//a=10,b=20

	}
	
	public static void change(int a, int b){
		System.out.println("a:"+a+", b:"+b);//a=10,b=20
		a = b;//a=20
		b = a+b;//b=40
		System.out.println("a:"+a+", b:"+b);//a=20,b=40
	}

}
