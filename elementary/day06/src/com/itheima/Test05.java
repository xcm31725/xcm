package com.itheima;

import java.util.Scanner;

/*
 * ׫дһ������������һ�����������������������Чλ
 * */
public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������һ��������");
		int n = sc.nextInt();
		
		int num = getLeng(n);
		System.out.println("num:"+num);
	}
	
	public static int getLeng(int n){
		int count = 0;
		
		if(n<0){
			n *= -1;
		}
		
		while(true){
			
			
			if(n>0 && n<10){
				count++;
				return count;
			}
			
			n /= 10;
			count++;
		}
	}

}
