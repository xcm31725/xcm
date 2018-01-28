package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Collections:
 * 
 * 面试题：Collection和Collections有什么去别
 * 		Collection是集合的体系最高顶层，包含集合体系的共性
 * 		Collections是一个工具类，方法都是用于操作Collection
 * */
public class CollectionsDemo {

	public static void main(String[] args) {
		//method();
		//method1();
		//method2();
		//method3();
		//method4();
		//static void sort(List list) 按照列表中元素的自然顺序进行排列
		List list = new ArrayList();
		
		list.add(2);
		list.add(1);
		list.add(4);
		list.add(3);
		
		Collections.sort(list);
		System.out.println(list);
	}


	private static void method4() {
		//static void shuffle(List list)傻否，随机置换
		List<String> src = new ArrayList<String>();
		
		src.add("xcm");
		src.add("czm");
		src.add("xhd");
		
		Collections.shuffle(src);
		System.out.println(src);
	}


	private static void method3() {
		//static void reverse(List<?> list) 反转
		List<String> src = new ArrayList<String>();
		
		src.add("xcm");
		src.add("czm");
		src.add("xhd");	
		
		Collections.reverse(src);
		System.out.println(src);
	}


	private static void method2() {
		//static void fill(List list, T obj) 使用指定对象填充指定列表的元素 
		List<String> src = new ArrayList<String>();
		
		src.add("xcm");
		src.add("czm");
		src.add("xhd");
		
		Collections.fill(src, "xcm");
		System.out.println(src);
	}
	

	private static void method1() {
		//static void copy(List dest, List src) 把源列表中元素覆盖到目标列表
		//注意：目标列表的长度至少等于源列表的长度
		List<String> src = new ArrayList<String>();
		
		src.add("xcm");
		src.add("czm");
		src.add("xhd");
		
		List<String> dest = new ArrayList<String>();
		dest.add("ss");
		dest.add("ss");
		dest.add("ss");
		dest.add("ss");
		
		Collections.copy(dest, src);
		System.out.println(dest);
	}

	private static void method() {
		//static int binarySearch(List list, T key) 使用二分查找法查找指定元素在指定列表的索引位置 
		List list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(Collections.binarySearch(list, 3));
	}

}
