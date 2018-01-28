package com.itheima7;

import java.util.ArrayList;

/*
 * 7、统计集合中元素包含数字字符的字符串的个数
			例如:  "a2bc"这个字符串就包含了数字字符'2'
		ArrayList<String> list = new ArrayList<String>();
		list.add("robin");
		list.add("a1b2c3");
		list.add("java");
		list.add("abc123");
		list.add("hello");
		
		要求:使用两种方式完成
		提示:
			(1)使用传统方式
				获取到每一个元素(字符串),遍历字符串,拿到每一个字符,判断该字符是否是数字字符
			(2)使用正则表达式
 * */
public class Test {

	public static void main(String[] args) {
		//arrayPrint();
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("robin");
		list.add("a1b2c3");
		list.add("java");
		list.add("abc123");
		list.add("hello");
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			if(s.matches(".*[0-9].*")){
				count++;
			}
		}
		System.out.println(count);
	}

	private static void arrayPrint() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("robin");
		list.add("a1b2c3");
		list.add("java");
		list.add("abc123");
		list.add("hello");
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			for(int j=0;j<s.length();j++){
				if(s.charAt(j)>='0'&&s.charAt(j)<='9'){
					count++;
					break;
				}	
			}
		}
		System.out.println(count);
	}

}
