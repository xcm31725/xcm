package com.itheima_01;

public class MethodDemo02 {

	public static void main(String[] args) {
		int[] arr = {11,43,54,75,23,1};
		
		int min = getMin(arr);
		System.out.println("min:"+min);
		System.out.println("--------------------");
		
		int max = getMax(arr);
		System.out.println("max:"+max);
	}
	
	//获取数组中的最大值
	public static int getMax(int[] arr){
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>max){
				max = arr[i];
			}
		}
		return max;
	}
	
	//获取数组中的最小值
	public static int getMin(int[] arr){
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]<min){
				min = arr[i];
			}
		}
		return min;
	}
}
