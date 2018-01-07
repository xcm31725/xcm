package com.itheima_01;

public class MethodDemo_05 {

	public static void main(String[] args) {
		int[] arr = {11,45,90,48,16};
		
		int max = aaa(arr);
		System.out.println("max="+max);
	}
	public static int aaa(int[] arr){
		int max = arr[0];
		for(int i=0; i<arr.length-1; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		return max;
	}

}
