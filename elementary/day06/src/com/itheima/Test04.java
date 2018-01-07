package com.itheima;

public class Test04 {

	public static void main(String[] args) {
		int[] arr = {171,72,19,16,118,51,210,7,18};
		
		int sum = getSun(arr);
		System.out.println("sum:"+sum);
	}
	
	public static int getSun(int[] arr){
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%10!=7 && arr[i]/10%10!=7 && arr[i]%2==0){
				sum += i;
			}
		}
		return sum;
	}

}
