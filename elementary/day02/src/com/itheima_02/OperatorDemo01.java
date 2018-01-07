package com.itheima_02;

public class OperatorDemo01 {

	public static void main(String[] args) {
		/*int i = 3;
		int b = 4;
		System.out.println(i + b);
		System.out.println(i - b);
		System.out.println(i * b);
		System.out.println(i / b);
		
		System.out.println("-----------------------");
		System.out.println(i / (double)b);
		System.out.println("-----------------------");
		
		int num = 317;
		System.out.println(num%10);
		System.out.println(num/10%10);
		System.out.println(num/10/10%10);
		System.out.println("-----------------------");
		
		char c = 'A';
		char c1 = '2';
		System.out.println(c + c1 + "zheshishenmone");
		System.out.println();*/
		
		int a = 10;
		a++;
		System.out.println("a="+a);
		System.out.println("-----------------------");

		/*int b = a++;
		//int b = ++a;
		System.out.println("a="+a);
		System.out.println("b="+b);*/ 
		
		short c = 10 ;
		//注意：c += a;就相当于c = (int)(a+c);就相当于强制类型转换    格式：变量 = (强制转换的类型)(变量 + 变量的本身);
		c += a;
		
		 
	}

}




















