package com.itheima_01;

public class ForTest03 {

	public static void main(String[] args) {
		int add = 0;
		for(int i=1; i<=100; i++){
			if((i % 7 == 0) || (i / 10 % 10 == 7) || (i % 10 == 7)){
				System.out.println("1~100之间包含7或者7的倍数为："+i);
				add++;
			}
		}
		System.out.println("共"+add+"次");
	}

}
