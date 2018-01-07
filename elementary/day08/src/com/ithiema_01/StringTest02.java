package com.ithiema_01;

public class StringTest02 {

	public static void main(String[] args) {
		String s = "woaijava,zhenbang";
		int index = s.indexOf("java");//获取字符串第一次出现的索引
		String s1 = s.substring(0,index);//截取在这个范围内的字符串
		String s2 = s.substring(index+"java".length());//截取从第几个索引开始的
		
		System.out.println(s1+s2);

	}

}
