package com.itheima;

import java.util.Scanner;

public class Text12 {

	public static void main(String[] args) {
		int[] arr = {13,15,19,28,33,45,78,106};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入查找的值：");
		int key = sc.nextInt();
		
		int index = bb(arr, key);
		System.out.println("index:"+index);
	}
	/*
	 * 查找位置
	 * */
	public static int aa(int[] arr, int key){
		for(int i=0; i<arr.length; i++){
			if(arr[i] == key){
				return i;
			}
		}
		return -1;
	}

	/*
	 * 二分法查找
	 * */
	public static int bb(int[] arr, int key){
		int min,max,mid;
		min = 0;
		max = arr.length-1;
		
		while(max >= min){
			mid = (min + max) >> 2;
			if(key > arr[mid]){
				min= mid + 1;
			}else if(key < arr[mid]){
				max = mid -1;
			}else{
				return mid;
			}
		}
		return -1;
	}
	
	/*public static int cc(int[] arr, int key){
		int min,max,mid;
		max = arr.length-1;
		min = 0;
		mid = (max + min)/2;
		
		while(arr[mid] != key){
			if(arr[mid] > min){
				min = mid + 1;
			}else if(){
				
			}
		}
		return mid;
	}*/
}















