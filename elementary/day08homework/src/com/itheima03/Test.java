package com.itheima03;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��������ַ�����");
		String scrStr = sc.nextLine();

		System.out.print("������С�ַ�����");
		String delster = sc.nextLine();
		
		String[] str = scrStr.split(delster);
		
		int index=0;
		int count = 0;
		while((index=scrStr.indexOf(delster))!=-1){
			String s1 = scrStr.substring(0, index);
			String s2 = scrStr.substring(index+delster.length());
			scrStr = s1+s2;
			count++;	
		}
		
		/*String s = "";
		int count = -1;
		for (int i = 0; i < str.length; i++) {
			s += ""+str[i];
			count++;
		}*/
		System.out.println("Դ�ַ������ܹ�����:"+count+" ��"+delster+" ɾ��"+delster+"����ַ���Ϊ:"+scrStr);

	}

}
