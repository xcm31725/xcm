package com.itheima07;

import java.util.Random;

//1.获取一个1-100之间(包含1和100)的随机数n，求2-n之间（包含2和n）偶数的个数，并打印到控制台上;
public class Test1 {

	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt(100)+1;
		int sum = 0;
		for(int i=0;i<=n;i++){
			if(i%2==0){
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
