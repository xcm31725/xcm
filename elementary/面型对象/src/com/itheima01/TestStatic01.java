package com.itheima01;

public class TestStatic01 {

	public static void main(String[] args) {
		//Test t = new Test();
		//t.print1();
		
		Test.print2();    // 静态多了一种调用方式，可以通过类名.
		

	}

}

class Test{
	int num1 = 10;//非静态成员变量
	static int num2 = 20;//静态成员变量
	
	/*public void print1(){ //非静态的成员方法，既可以访问静态的成员也可以访问非静态的
		System.out.println(num1);
		System.out.println(num2);
	}*/
	
	public static void print2(){//静态成员方法，无法从静态中访问非静态变量
		//System.out.println(num1);
		System.out.println(num2);
	}
	
}






















