package com.ithiema_01;

public class StringDemo01 {

	public static void main(String[] args) {
		String s = "hello";
		String s1 = new String("hello");
		String s2 = "Hello";
		
		//判断两个字符串的值是否相等区分大小写
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println("--------------");
		
		//判断两个字符串的值是否相等不区分大小写
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println("--------------");
		
		//判断字符串对象是否已str开头
		System.out.println(s.startsWith("he"));
		System.out.println(s.startsWith("ll"));
		System.out.println("--------------");
		
		//判断字符串对象是否已str结束
		System.out.println(s.endsWith("he"));
		System.out.println(s.endsWith("ll"));
	}

}
