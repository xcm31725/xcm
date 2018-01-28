package com.itheima4;

import java.util.ArrayList;
import java.util.List;

/*
 * 4�������������󣬲��ô���ʵ�֣�
		(1)�����´��룺
			List<String> list = new ArrayList<>();
			
			list.add("a");
			list.add("a");
			list.add("a");
			list.add("b");
			list.add("b");
			list.add("c");
			list.add("d");
			list.add("d");
			list.add("d");
			list.add("d");
			list.add("d");

		(2)���巽��(������Ϊfrequency)ͳ�Ƽ�����ָ��Ԫ�س��ֵĴ�������"a" 3,"b" 2,"c" 1
			System.out.println(frequency(list, "a"));	// 3
			System.out.println(frequency(list, "b"));	// 2
			System.out.println(frequency(list, "c"));	// 1
			System.out.println(frequency(list, "d"));	// 5
			System.out.println(frequency(list, "xxx"));	// 0
 * 
 * */
public class Test {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("g");
		list.add("c");
		list.add("d");
		list.add("d");
		list.add("z");
		list.add("d");
		list.add("d");
		System.out.println(frequency(list, "a"));	// 3
		System.out.println(frequency(list, "b"));	// 2
		System.out.println(frequency(list, "c"));	// 1
		System.out.println(frequency(list, "d"));	// 5
		System.out.println(frequency(list, "xxx"));	// 0
	}
	
	private static int frequency(List<String> list, String str) {
		int a = 0;
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			if(s.equals(str)){
				a++;
			}
		}		
		return a;
	}

}
