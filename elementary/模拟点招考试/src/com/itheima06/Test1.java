package com.itheima06;

import java.util.Scanner;

/*
 * 1.	根据输入的消费金额，输出对应的折扣，并根据折扣在控制台输出对应折扣后的金额，折扣的范围如下（P代表消费的金额）（8分）
	P>=2000 7折，1000<=P<2000 8折，500<=P<1000 9.5折，P<500 不打折

 * */
public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的消费金额：");
		int p = sc.nextInt();
		
		//int n = 0;
		if(p<0){
			System.out.println("你输入的消费金额有误");
		}else{
			if(p>=2000){
				System.out.println(p*0.7);
			}else if(p>=1000){
				System.out.println(p*0.8);
			}else if(p>=500){
				System.out.println(p*0.95);
			}else{
				System.out.println(p);
			}
		}

	}

}
