package com.itheima;

import java.util.Random;

public class Test01 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int i = r.nextInt(100)+1;
		int sum = 0;
		
		for(int a=0; a<=i; a++){
			sum += a;
		}
		System.out.println("0到随机数的之间所有的和sum="+sum);

	}

}
