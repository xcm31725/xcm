package com.itheima;

import java.util.Scanner;

/*
 * �ַ�����ת
 * ����������¼�롰abc��
 * �������cba��
 * */
public class StringTest05 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("������һ���ַ�����");
		 String s = sc.nextLine();
		 
		 //String result = reverse(s);
		 String result1 = reverse1(s);
		 
		// System.out.println(result);
		 System.out.println(result1);
	}
	
	//���ַ������ű���
	public static String reverse(String s){
		String ss = "";
		for(int i=s.length()-1; i>=0; i--){
			
			ss += s.charAt(i);
		}
		
		return ss;
	}
	
	//���ַ���ת��Ϊ�ַ����飬Ȼ����ַ�������з�ת�������ַ�����ת��Ϊ�ַ���
	public static String reverse1(String s){
		//���ַ���ת��Ϊ�ַ�����
		char[] arr = s.toCharArray();
		for(int start=0,end=arr.length-1;start<=end;end--,start++){
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
		//���ַ�����ת��Ϊ�ַ���,ͨ������������ʵ��
		String s1 = new String(arr);
		return s1;
	}

}
