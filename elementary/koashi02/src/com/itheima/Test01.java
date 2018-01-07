package com.itheima;

import java.util.Scanner;

/*
 * 1.请分别设计求长方形面积和周长的方法，通过方法传参的方式，将长方形的长和宽传入并将结果返回，计算长方形的面积和周长
 * */
public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入长方形的长：");
		int c = sc.nextInt();
		
		System.out.println("请输入长方形的宽：");
		int k = sc.nextInt();

		int s = getMianJi(c,k);
		System.out.println("s:"+s);
		
		int l = getZhouchang(c,k);
		System.out.println("l:"+l);
	}
	
	public static int getMianJi(int c,int k){
		return c*k;
	}
	
	public static int getZhouchang(int c,int k){
		return (c+k)*2;
	}

}
