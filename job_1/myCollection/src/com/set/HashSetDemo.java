package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 使用HashSet储存字符串并遍历
 * 
 * Set集合的特点是
 * 		无序（储存和读取的顺序可能不一样）
 * 		不允许重复（要求元素唯一）
 * 		没有索引
 * */
public class HashSetDemo {

	public static void main(String[] args) {
		//创建集合对象
		//HashSet<String> hs = new HashSet<String>();
		Set<String> set = new HashSet<String>();
		//添加元素
		set.add("xcm");
		set.add("xgd");
		set.add("xlm");
		
		//遍历集合对象
		//通过toArray()
		//method(set);
		
		//通过迭代器遍历
		//method1(set);
		
		//通过增强for循环
		for (String string : set) {
			System.out.println(string);
		}
	}
	
	//通过迭代器遍历
	private static void method1(Set<String> set) {
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	//通过toArray()
	private static void method(Set<String> set) {
		Object[] str = set.toArray();
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

}
