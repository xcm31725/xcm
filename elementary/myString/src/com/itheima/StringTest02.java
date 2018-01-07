package com.itheima;
/*
 * 遍历字符串（获取字符串中的每一字符）
 * */
public class StringTest02 {

	public static void main(String[] args) {
		String s = "abcde";
		
		for(int i=0; i<s.length(); i++){
			
			System.out.println(s.charAt(i));
		}
	}

}
