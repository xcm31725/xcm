package com.ithiema_01;

import java.util.Scanner;

public class StringTest06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ���ַ�����");
		String s = sc.nextLine();
		
		//��ȡ��һ���ַ�
		String s1 = s.substring(0,1);
		
		//��ȡ�ӵڶ����ַ��Ժ���ַ�
		String s2 = s.substring(1);
		
		//ƴ�ӵ�һ��Ϊ��д�������ΪСд
		String s3 = s1.toUpperCase()+s2.toLowerCase();
		
		System.out.println("s3��"+s3);
	}

}
