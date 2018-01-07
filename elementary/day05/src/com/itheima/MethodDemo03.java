package com.itheima;
/*
 * 方法重载：在同一个类中，出现了方法名相同的情况。
 * 方法重载的特点：
 * 		方法名形同，参数列表不同。与返回值无关。
 * 		参数列表不同：
 * 			参数的个数不同
 * 			参数对应的数据类型不同
 * 			参数类型的顺序不同
 * 
 * 注意：
 * 		在调用方法的时候，java虚拟机会通过参数列表的不同来区分同名的方法
 * 方法重载的好处：功能形同的方法，我们把这些方法设置成互为重载的形式，这样可以方便调用者调用，使调用这不需要记忆很多的方法名
 * 
 * */
public class MethodDemo03 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		int result = sum(a,b);
		System.out.println(result);
	}
	
	//两个数的和
	public static int sum(int a, int b){
		return a + b;
	}
	
	//三个数的和
	public static int sum(int a, int b, int c){
		return a + b + c;
	}
	
	public static double sum(double a, double b){
		return a + b;
	}
}
















