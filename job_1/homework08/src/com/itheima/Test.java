package com.itheima;

import java.util.Scanner;

/*
 * 1、分析以下需求，并用代码实现：
		键盘录入字符串,判断是否是数字字符串(使用下面三种方式分别实现)
			(1)遍历字符串,拿到每一个字符,判断是否是数字字符串
			(2)通过使用正则表达式判断 
			(3)通过使用异常处理判断

 * */
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个字符串：");
		String s = sc.nextLine();
		
//		boolean flag = string(s);
//		System.out.println(flag);
		
		boolean flag = exc(s);
		System.out.println(flag);
		
		/*try {
			if(s.matches(".*\\d.*")) {
				throw new YouShuZiZiFuException("有数字字符");
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
