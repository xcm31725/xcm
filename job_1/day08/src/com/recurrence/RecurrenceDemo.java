package com.recurrence;

public class RecurrenceDemo {

	public static void main(String[] args) {
		int result = jC(5);
		System.out.println(result);
	}
	
	//�������÷���
	public static int jC(int n){
		//����
		if(n == 1) {
			return 1;
		} else {
			return n * jC(n - 1);
		}
	}
}	
