package com.itheima;

import java.util.Scanner;

/*
 * 1�������������󣬲��ô���ʵ�֣�
		����¼���ַ���,�ж��Ƿ��������ַ���(ʹ���������ַ�ʽ�ֱ�ʵ��)
			(1)�����ַ���,�õ�ÿһ���ַ�,�ж��Ƿ��������ַ���
			(2)ͨ��ʹ��������ʽ�ж� 
			(3)ͨ��ʹ���쳣�����ж�

 * */
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ���ַ�����");
		String s = sc.nextLine();
		
//		boolean flag = string(s);
//		System.out.println(flag);
		
		boolean flag = exc(s);
		System.out.println(flag);
		
		/*try {
			if(s.matches(".*\\d.*")) {
				throw new YouShuZiZiFuException("�������ַ�");
			}
		} catch (Exception e){
			e.printStackTrace();
		}*/
		
	}

	private static boolean exc(String s) {
		
		try {
			Integer i = Integer.parseInt(s);
			return false;
		} catch(Exception e) {
			e.printStackTrace();
			return true;
			
		}
	}
	
	private static boolean regex(String s) {
		if(s.matches(".*\\d.*")) {
			return true;
		}
		return false;
	}

	private static boolean string(String s) {
		char[] arr = new char[s.length()];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] >= '0' || arr[i] <= '9') {
				return true;
			}	
		}
		return false;
		
		/*for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) <= '9' || s.charAt(i) <= '0') {
				return true;
			}
		}
		return false;*/
		
	}

}
