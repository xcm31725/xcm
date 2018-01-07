package com.itheima02;

import java.util.Random;

//2.获取一个1-100之间(包含1和100)的随机数n，求0-n之间的偶数和，并打印到控制台上（10分）。
public class Test2 {
	public static void main(String[] args) {
		int sum = 0;
		Random r = new Random();
		int n = r.nextInt(100)+1;
		
		for(int i=1;i<=100;i++){
			if(i%2==0){
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
