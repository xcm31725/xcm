package com.itheima;

import java.util.Scanner;

public class Demo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int a = sc.nextInt();
		System.out.println("������ڶ�������");
		int b = sc.nextInt();
		
		int sum = getSum(a,b);
		
		
		System.out.println(sum);
	}
	
	public static int sum(){
		int sum = 0;
		
		for (int i = 1; 
				i <= 5;
				i++) {
			sum += i;
		}
		return sum;
	}
	
	public static int getSum(int a ,int b){
		int c = a+b;
		return c;
	} 

}
