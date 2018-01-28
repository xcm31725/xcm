package com.itheima03;

public class Demo {
	private Demo(){}
	
	public static int getMax(int[] arr){
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i]){
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int getIndex(int[] arr,int a){
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==a){
				return i;
			}
		}
		return -1;
	}
}
