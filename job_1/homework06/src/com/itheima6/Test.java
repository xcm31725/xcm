package com.itheima6;

import java.util.ArrayList;

/*
 * 6、定义一个方法,把集合(存储的是字符串)中的旧元素替换成新元素
		replaceAll(ArrayList<String> list,String oldStr,String newStr)
 * */
public class Test {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("xcm");
		list.add("xgd");
		list.add("db");
		list.add("ch");
		System.out.println(list);
		replaceAll(list,"db","sd");
	}
	
	public static void replaceAll(ArrayList<String> list,String oldStr,String newStr){
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			if(s.equals(oldStr)){
				list.set(i, newStr);
			}
		}
		System.out.println(list);
	}

}
