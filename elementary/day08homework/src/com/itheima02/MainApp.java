package com.itheima02;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��������ַ�����");
		String s1 = sc.nextLine();

		System.out.print("������С�ַ�����");
		String s2 = sc.nextLine();
		
	//	String[] str = s1.split(s2);
		//int i = str.length;
//		int count = 0;
//		String s = "";
//		for (int j = 0; j < str.length; j++) {
//			
//			s += "";
//			//System.out.println(str[j]);
//			count++;
//		}
		int index = 0;
		int count = 0;
		while((index=s1.indexOf(s2))!=-1){//�ý�ȡ��ֵ���жϣ���ִ��ѭ������
			String str1 = s1.substring(0,index);//��ȡ���֮����ַ���
			String str2 = s1.substring(index+s2.length());
			s1 = str1+str2;
			count++;
		}
		//System.out.println(str.length);
		System.out.println("С�ַ���"+s2+",�ڴ��ַ���"+s1+"�й�����"+count+"��");
	}

}
