package com.itheima_03;

import java.util.Scanner;

//�����ܱ�4����������100����   ���߿��Ա�400����

public class ScannerTest05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������һ����ݣ�");
		
		int a = sc.nextInt();
		
		String str = (((a%4==0)&&(a/100!=0))||(a/400==0))?"����":"ƽ��";
		System.out.println("�������ǣ�"+str);

	}

}
