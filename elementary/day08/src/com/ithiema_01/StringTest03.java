package com.ithiema_01;

public class StringTest03 {

	public static void main(String[] args) {
		String s = "abcde";
		
		//ԭʼ����
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(4));
		System.out.println("-----------");
		
		//�Ľ�����
		for(int i=0; i<s.length(); i++){
			System.out.println(s.charAt(i));
		}
	}

}
