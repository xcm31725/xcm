package com.itheima_03;

public class Test03 {

	public static void main(String[] args) {
		int sum = getSum();
		System.out.println(sum);
	}
	public static int getSum(){
	    int sum = 0;  
		for(int i=1; i<=100; i++){
			if(i % 2 == 0){
				sum += i;
			}
		}
		return sum;
	}

}
