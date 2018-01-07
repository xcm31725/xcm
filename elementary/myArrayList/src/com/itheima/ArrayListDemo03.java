package com.itheima;
/*
 * 集合的遍历
 * 		通过size()方法和 get()方法实现的
 * */
import java.util.ArrayList;

public class ArrayListDemo03 {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		
		//add(E e):添加元素
		array.add("hello");
		array.add("world");
		array.add("java");
		
		for (int i = 0; i < array.size(); i++) {
			System.out.println("array:"+array.get(i));
		}
		System.out.println("-----------------");
		
		//最标准的用法
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);//先接收下，为了方便进行操作
			System.out.println("array:"+s);
		}

	}

}
