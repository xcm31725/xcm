package com.recurrence;

public class RecurrenceDemo {

	public static void main(String[] args) {
		int result = jC(5);
		System.out.println(result);
	}
	
	//方法调用方法
	public static int jC(int n){
		//出口
		if(n == 1) {
			return 1;
		} else {
			return n * jC(n - 1);
		}
	}
}	
