package com.itheima;

import java.util.Scanner;

/*
 * 方法的定义：
 * 
 * 定义格式：
 	* 修饰符 返回值类型 方法名 (数据类型 参数1,数据类型 参数2...){//声明部分
 	* 	方法体;    
 	* 	return 返回值;
 	* }
 	* 
 	*  方法的定义部分
 	*  		方法的定义格式：
 	*  返回值类型：看返回的是什么类型就写什么类型，没有返回值类型就是void
 	*  参数列表：看里面传进去的是什么类型就是什么类型，如果没有要传递的值那就什么都不写
 	*  
 	* 方法的调用：直接调用   方法名(有参数传递参数，没有就什么都不写);
 	* 		      输出调用   System.out.println( 方法名(有参数传递参数，没有就什么都不写));
 	* 		      赋值调用   返回值类型 变量名 = 方法名(有参数传递参数，没有就什么都不写);
 	* 				System.out.println(变量名);
 	* 说明：又返回值就要写返回值类型，要打印或者输出方法的结果就写void
 * */
public class MethodDowe01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("请输入第一个数：");
		int a = sc.nextInt();
		
		System.out.print("请输入第二个数：");
		int b = sc.nextInt();
		
		System.out.print("请输入第三个数：");
		int c = sc.nextInt();
		
		//sum(a,b);
		System.out.println(sum(a,b));
		System.out.println("--------------");
		
		int sum = sum(a,b);
		System.out.println(sum);
		System.out.println("--------------");
		
		int result = max(a,b);
		System.out.println(result);
		System.out.println("--------------");
		
		int result1 = min(a,b);
		System.out.println(result1);
		System.out.println("--------------");
		
		boolean result2 = compare(a,b);
		System.out.println(result2);
		
		System.out.println("--------------");
		int result3 = getMax(a,b,c);
		System.out.println(result3);
		
		System.out.println("--------------");
		printHelloWorld();
		
		System.out.println("--------------");
		printNumber(a);
	}

	//注意方法声明在类中方法外
	public static int sum(int a, int b){
		return a+b;
	}
	
	//两个数中最大的数
	public static int max(int a, int b){
		if(a>b){
			return a;
		}else{
			return b;
		}
	}
	
	//两个数中最小的数
	public static int min(int a, int b){
		if(a<b){
			return a;
		}else{
			return b;
		}
	}
	
	//比较两个数是否相等
	public static boolean compare(int a, int b){
		return a == b;
	}
	
	//比 较三个数的最大值
	public static int getMax(int a, int b, int c){
		if (a>b) {
			if (a>c) {
				return a;
			}else {
				return c;
			}
		} else {
			if (b>c) {
				return b;
			} else {
				return c;
			}
		}
	}
	
	//无返回值的调用  输出10次HelloWorld
	public static void printHelloWorld(){
		for(int i=0; i<10; i++){
			System.out.println("HelloWorld");
		}
	}
	
	//输出1~n之间所有的数 无返回值类型
	public static void printNumber(int a){
		for (int i = 0; i < a; i++) {
			System.out.println(i+1);
		}
	}
}




















