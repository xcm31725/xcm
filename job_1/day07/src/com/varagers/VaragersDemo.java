package com.varagers;

public class VaragersDemo {

	public static void main(String[] args) {
		int sum = sum(1,2,3,4,5,6,7,8,9,10);
		System.out.println("sum:"+sum);
	}
	
	public static int sum(int...arr){
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
}
