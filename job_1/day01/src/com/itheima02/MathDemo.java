package com.itheima02;

public class MathDemo {

	public static void main(String[] args) {
		//abs(double a) :返回 double 值的绝对值。
		//System.out.println(Math.abs(1));
		//System.out.println(Math.abs(-1));
		
		//ceil(double a) :返回最小的（最接近负无穷大）double 值，该值大于等于参数，并等于某个整数。
		System.out.println(Math.ceil(1.4));
		System.out.println(Math.ceil(1.6));
		//floor(double a) :返回最大的（最接近正无穷大）double 值，该值小于等于参数，并等于某个整数。
		System.out.println(Math.floor(1.2));
		System.out.println(Math.floor(1.7));

		
		//round(double a) :返回最接近参数的 long。
		System.out.println(Math.round(1.3));//四舍五入
		System.out.println(Math.round(1.6));
		
		//max(double a, double b) :返回两个 int 值中较大的一个。
		System.out.println(Math.max(2, 4));
		//
		System.out.println(Math.min(1,4));
		
		//pow(double a, double b) :返回第一个参数的第二个参数次幂的值。
		System.out.println(Math.pow(2, 3));
		
		//random():返回带正号的 double 值，该值大于等于 0.0 且小于 1.0。
		System.out.println(Math.random());
		
		//π的值
		System.out.println(Math.PI );
		
	}

}
