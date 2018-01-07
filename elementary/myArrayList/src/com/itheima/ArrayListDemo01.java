package com.itheima;

import java.util.ArrayList;

/*
 * 为什么会出现集合呢？
 * 
 * 因为StringBuilder只能存储一个字符串不一定能满足要求，
 * 数组是定长的适应不了变化的要求
 * 
 * 集合类的特点：
 * 		长度可变。
 * ArrayList<E>:
 * 		大小可变数组的实现
 * 		
 * 		<E>：是一种特殊的数据类型，泛型。
 * 		使用：ArrayList<String>、ArrayList<student>
 * 
 * 添加元素：
 * 		public boolean add(E e):添加元素
 * 		public void add(int index,E element):在指定位置添加一个元素
 * */
public class ArrayListDemo01 {
	public static void main(String[] args) {
		//创建集合
		ArrayList<String> array = new ArrayList<>();
		
		//add(E e):添加元素
		array.add("hello");
		array.add("world");
		array.add("java");
		System.out.println("array:"+array);
		System.out.println("-------------");
		
		
		//add(int index,E element):在指定位置添加一个元素
		array.add(1, "nihao");
		array.add(3, "ma");
		array.add(5, "yuyan");
		System.out.println("array:"+array);
	}
}















