package com.list;

import java.util.ArrayList;
import java.util.List;

/*
 * List:
 * 		有序的（储存和读取的顺序是一致的）
 * 		有整数索引
 * 		允许重复的
 * 
 * List的特有功能：
 * 		 void add(int index, E element) 
 * 		 E get(int index) 
 * 		 E remove(int index)  
 * 		 E set(int index, E element) 
 * */
public class ListDemo {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		
		//void add(int index, E element):从指定索引添加元素
		l.add(0,"xcm");
		l.add(0, "xgd");
		l.add(1, "xn");
		
		//System.out.println(l);
		for (String string : l) {
			System.out.println(string);
		}
		
		System.out.println("--------------");
		//E set(int index, E element) ：修改指定索引的元素
		l.set(1, "xtx");
		for (String string : l) {
			System.out.println(string);
		}
		System.out.println("--------------");
		// E remove(int index) ：删除指定元素并返回该元素 
		l.remove(1);
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		
	}

}
