package com.itheima3;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 3、分析以下需求，并用代码实现：
		(1)定义ArrayList<String>集合，存入多个字符串 
		(2)将集合里元素中包含的数字替换成'*'字符 
			使用String类中的String replaceAll(String regex, String replacement)方法
		(3)然后利用迭代器和增强for两种方式遍历集合元素并输出
 * */
public class Test {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("asd2sd");
		list.add("asd2sadsd");
		list.add("asdsd");
		list.add("asasd");
		list.add("123124");
		
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			//String s2 = s.replaceAll(".*\\d.*", "[a-zA-Z]*\\*[a-zA-Z]*");
			list.set(i, s.replaceAll("\\d", "*"));
		}
		
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("-------------------");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
