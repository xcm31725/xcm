package com.ithiema_01;

public class StringTest05 {

	public static void main(String[] args) {
		String s = "name";
		char[] chs = s.toCharArray();//转换成字符数组
		
		for (int i = 0; i < chs.length; i++) {
			System.out.println(chs[i]);
		}
		
		//把大写转换长小写
		System.out.println("HelloWorld".toLowerCase());
		//把小写转换长大写
		System.out.println("HelloWorld".toUpperCase());
	}

}
