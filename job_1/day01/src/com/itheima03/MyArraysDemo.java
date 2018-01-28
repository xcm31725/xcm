package com.itheima03;
/*
 * 工具类的特点：
 * 		被private修饰和static修饰
 * 
 * */
public class MyArraysDemo {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		//Demo d = new Demo();
		//d.getMax(arr);
		System.out.println(Demo.getMax(arr));
		System.out.println(Demo.getIndex(arr,3));
	}


}
