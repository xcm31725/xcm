package com.itheima_01;

public class ForTest02 {

	public static void main(String[] args) {
		int add = 0;
		for(int i=1; i<=100; i++){
			if((i % 3 == 0) && (i % 5 == 0)){
				System.out.println("1~100之间既可以整除3也可以整除5的数为："+i);
				add++;
			}
		}
		System.out.println("共"+add+"次");
	}

}
