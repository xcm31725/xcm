package com.itheima;

import java.util.Scanner;

public class MainAPP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������5-12λ���֣�");
		long n = sc.nextInt();
		
		checkQQ(n);
	}
	
	public static void checkQQ(long s){
		if(s>=10000 && s<1000000000000l){
			System.out.println("��֤�ɹ���");
		}else{
			System.out.println("�����������");
		}
	}

}
