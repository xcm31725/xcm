package com.itheima;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		int[] arr = {12,34,12,3,5};
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int n = sc.nextInt();
		
		int num = index(arr,n);
		System.out.println("num:"+num);
	}
	
	public static int index(int[] arr,int n){
		for (int i = 0; i < arr.length; i++) {
			if(n == arr[i]){
				return i;
			}
		}
		return -1;
	}

}
