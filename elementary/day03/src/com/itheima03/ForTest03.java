package com.itheima03;

public class ForTest03 {

	public static void main(String[] args) {
		int num = 0;
		for(int i = 100; i<1000; i++){
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/100;
			
			if((ge*ge*ge+shi*shi*shi+bai*bai*bai) == i){
				System.out.println(i);
				num++;
			}
			
		}
		System.out.println(num);

	}

}
