package com.itheima_01;

public class MethodDemo01 {

	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55};
		
		printArray(arr);
	}
	
	public static void printArray(int[] arr){
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1) {
				System.out.println(arr[i]+"]");
			}else{
				System.out.print(arr[i]+", ");
			}
		}
	}

}
