package com.itheima_01;

public class Test01 {

	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55};
		
		System.out.println(demo(arr,66));
	}
	
	public static int demo(int[] arr,int num){
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				index = i;
				break;
			}
		}
		return index;
	}
}
