package com.itheima;

import java.util.Scanner;

public class Text6 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++){
			System.out.println("ÇëÊäÈëµÚ"+(i+1)+"ÔªËØ");
			int number = sc.nextInt();
			arr[i] = number;
		}
		
		ser(arr);
		arry(arr);
	}
	
	public static void arry(int[] arr){
		System.out.print("[");
		for(int i=0; i<arr.length; i++){
			if(i == arr.length-1){
				System.out.println(arr[i]+"]");
			}else{
				System.out.print(arr[i]+", ");
			}
		}
	}
	
	 public static void ser(int[] arr){
		 for(int start=0,end=arr.length-1; start<=end; start++,end--){
			 int tmp = arr[start];
			 arr[start] = arr[end];
			 arr[end] = tmp;
		 }
	 }

}
