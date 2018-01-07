package com.itheima;

import java.util.Scanner;

public class Text7 {

	public static void main(String[] args) {
		int[] arr = {5,7,3,2,5};
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入查找的元素：");
		int number = sc.nextInt();
		
		int index = getIndex(arr, number);
		System.out.println("index="+index);
	}
	
	public static int getIndex(int[] arr, int value){
		for(int i=0; i<arr.length; i++){
			if(value == arr[i]){
				return i;
			}
		}
		return -1;
	}

}
