package com.itheima;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int min = arr[0];
		int max = arr[0];
		int agv = 0;
		int sum = arr[0];
		
		for(int i=1; i<=arr.length; i++){
			System.out.print("请输入第"+(i+1)+"个数：");
			int a = sc.nextInt();
			arr[i-1] = a;
			
			if(arr[i]>max){
				max = arr[i];
			}
			
			if(arr[i]<min){
				min = arr[i];
			}
			sum += arr[i];
		}
		agv = (sum-max-min)/(arr.length-2);
		System.out.println("选手的平均分是："+agv);

	}

}















