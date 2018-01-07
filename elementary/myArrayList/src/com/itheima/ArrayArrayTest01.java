package com.itheima;

import java.util.ArrayList;

public class ArrayArrayTest01 {

	public static void main(String[] args) {
		//创建字符串数组
		String[] str = {"张三丰","张无忌","宋元桥","法印","张翠山","摸头"};
		
		//创建集合
		ArrayList<String> array = new ArrayList<String>();
		
		//遍历字符串数组，并给集合赋值
		for (int i = 0; i < str.length; i++) {
			array.add(str[i]);
		}
		for (int i = 0; i < array.size(); i++) {
			String s1 = array.get(i);
			if(s1.startsWith("张")){
				System.out.println(s1);
			}
		}

	}

}
