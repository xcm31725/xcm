package com.itheima;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("请输入一个四位数：");
		int n = sc.nextInt();
		
		int[] arr = new int[4];
		arr[0] = n/1000%10;
		arr[1] = n/100%10;
		arr[2] = n/10%10;
		arr[3] = n%10;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] += 5;
			
			//System.out.println(arr[i]);
			arr[i] %= 10;
			
		}
		
		int temp = arr[0];
		arr[0] = arr[3];
		arr[3] = temp;
		
		temp = arr[1];
		arr[1] = arr[2];
		arr[2] =temp;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		//mi(arr,n);

	}
	
	/*public static void mi(int[] arr,int n ){
		arr[0] = n/1000%10;
		arr[1] = n/100%10;
		arr[2] = n/10%10;
		arr[3] = n%10;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] += 5;
		}
		
		int temp = arr[0];
		arr[0] = arr[3];
		arr[3] = arr[0];
		
		temp = arr[1];
		arr[1] = arr[2];
		arr[2] = arr[1];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}*/

}
