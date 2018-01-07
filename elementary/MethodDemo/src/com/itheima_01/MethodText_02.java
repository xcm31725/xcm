package com.itheima_01;

public class MethodText_02 {

	public static void main(String[] args) {
		text();
	}
	public static void text(){
		for(int i=100; i<1000; i++){
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/10/10%10;
			
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai == i){
				System.out.println(i);
			}
		}
	}

}
