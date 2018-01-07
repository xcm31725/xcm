package com.itheima;

public class ArgsDemo1_1 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		change(arr);
		print(arr);
		System.out.println("---------");
		changeNew(arr);
		print(arr);
	}
	
	public static void print(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void change(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			arr[arr.length-1] = 10;
		}
	}
	
	public static void changeNew(int[] arr){
		int[] newArr = {11,22,33,44,55};
		for (int i = 0; i < newArr.length; i++) {
			newArr[0] = 123;
			arr = newArr;
		}
	}
}
