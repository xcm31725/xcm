package com.foreach;

import java.util.ArrayList;
import java.util.Collection;

public class ForEachDemo {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		
		c.add("xcm");
		c.add("xgd");
		c.add("czm");
		
		/*for (Object object : c) {
			System.out.println(object);
		}*/
		for (String string : c) {
			//c.add("xsg");
			/*
			 * Exception in thread "main" java.util.ConcurrentModificationException:并发修改异常
			 * 
			 * 增强for循环的底层就是迭代器，所已不能用集合的方法添加元素
			 * */
			System.out.println(string);
		}
	}

}
