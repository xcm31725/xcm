package com.ithiema_01;

import java.util.Scanner;

public class StringTest04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String s = sc.nextLine();
		
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch<='Z' && ch>='A'){
				bigCount++;
			}else if(ch<='z' && ch>='a'){
				smallCount++;
			}else if(ch<='9' && ch>='0'){
				numberCount++;
			}else{
				System.out.println("��������ַ�"+ch+"�Ƿ�");
			}
		}
		System.out.println("��д��ĸ����"+bigCount+"��");
		System.out.println("Сд��ĸ����"+smallCount+"��");
		System.out.println("������"+numberCount+"��");

	}

}
