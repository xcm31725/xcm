package com.itheima;
/*
 * String类的转换功能：
 * char[] toCharArray():把字符串转换为字符数组
 * String toLowerCase():把字符串转换为小写字符串
 * String toUpperCase():把字符串转换为大写字符串
 * */
public class StingDemo03 {

	public static void main(String[] args) {
		String s = "abcde";
		
		//char[] toCharArray():把字符串转换为字符数组
		char[] chs = s.toCharArray();
		for(int i=0; i<chs.length; i++){
			System.out.println(chs[i]);//通过吧字符串转换为字符数组遍历字符串
		}
		System.out.println("--------------------");
		
		//String toLowerCase():把字符串转换为小写字符串
		System.out.println("HelloWorld".toLowerCase());
		//String toUpperCase():把字符串转换为大写字符串
		System.out.println("HelloWorld".toUpperCase());
	}

}
