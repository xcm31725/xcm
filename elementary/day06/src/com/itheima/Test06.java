package com.itheima;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("请输入第"+(i+1)+"个数：");
			int n = sc.nextInt();
			arr[i] = n;
		}
		
		priArr(arr);
		printArray(arr);
	}
	
	//遍历数组
	public static void priArr(int[] arr){
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if(arr.length-1==i){
				System.out.println(arr[i]+"]");
			}else{
				System.out.print(arr[i]+",");
			}
		}
	}
	
	//实现反转
	public static void printArray(int[] arr){
		for(int start=0,end=arr.length-1;start<end;start++,end--){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
		priArr(arr);
	}
	
}
 