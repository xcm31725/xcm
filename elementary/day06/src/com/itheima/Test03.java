package com.itheima;
/*
 * 不死神兔
 * 
 * 一对兔子每三个月生一对，假设兔子不死
 * */
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个月份：");
		int n = sc.nextInt();
		
		long result = sum(n);
		System.out.println("result:"+result);

	}
	
	public static int sum(int n){
		if(n==0||n==1){
			return 1;
		}
		
		int[] arr = new int[n];
		
		arr[0] = 1;
		arr[1] = 1;
		
		for(int i=2; i<arr.length; i++){
			arr[i] = arr[i-1] + arr[i-2];
		}
		return arr[arr.length-1];
	}

}
