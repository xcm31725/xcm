package com.itheima;

import java.io.InputStream;
import java.util.Scanner;

public class Text5 {

	public static void main(String[] args) {
		int[] arr = new int[6];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++){
			System.out.println("请输入第"+(i+1)+"分数（0~100):");
			int score = sc.nextInt();
			arr[i] = score;
		}
//		int max = max(arr);
//		int min = min(arr);
		int[] newArr = getMaxAndMin(arr);
		int min = newArr[1];
		int max = newArr[0];
		
		int sum = sum(arr);
		
		System.out.println("最后得分："+(sum-max-min)/(arr.length-2));
	}
	
	//获取最大值和最小值封装成一个数组
	public static int[] getMaxAndMin(int[] arr){
		int min = arr[0];
		int max = arr[0];
		
		for(int i=1; i<arr.length; i++){
			if(min > arr[i]){
				min = arr[i];
			}
			if(max < arr[i]){
				max = arr[i];
			}
		}
		
		int[] newArr = new int[2];
		max = newArr[0];
		min = newArr[1];
		
		return newArr;
	}
	
	//求和
	public static int sum(int[] arr){
		int sum = 0;
		for(int i=0; i<arr.length; i++){
			 sum += arr[i];
		}
		return sum;
	}
	
	//获取最大值
	public static int max(int[] arr){
		int max = arr[0];
		for(int i=1; i<arr.length; i++){
			if(max < arr[i]){
				max = arr[i];
			}
		}
		return max;
	}
	
	//获取最小值
	public static int min(int[] arr){
		int min = arr[0];
		for(int i=1; i<arr.length; i++){
			if(min > arr[i]){
				min = arr[i];
			}
		}
		return min;
	}
}
