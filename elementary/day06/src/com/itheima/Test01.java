package com.itheima;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("�������·ݣ�1~12����֮��:");
//		int n = sc.nextInt();
		
		while(true){
			System.out.print("�������·ݣ�1~12����֮��:");
			int n = sc.nextInt();
			
			switch(n){
			case 1:
			case 2:
			case 12:
				System.out.println("����");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("����");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("�ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("�＾");
				break;
			default:
				System.out.print("��������·�����,���������:");
				
			}
		}
		
	}

}
