package com.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/*
 * 需求：判断集合中是否包含元素java，如果有则添加元素android
 * Exception in thread "main" java.util.ConcurrentModificationException:并发修改异常
 * 迭代器是依赖于集合的，相当于集合的一个副本，当迭代器在操作的时候，如果发现和集合不一样，则抛出异常
 * 
 * 解决方案：
 * 		别使用迭代器
 * 		在使用迭代器进行遍历的时候使用迭代器来进行修改
 * */
public class IteratorDemo1 {

	public static void main(String[] args) {
		//method();
		//Collection c = new ArrayList();
		List c = new ArrayList();
		
		c.add("xcm");
		c.add("xgd");
		c.add("czm");
		
		/*//遍历每一个元素进行比较
		Iterator it = c.iterator();
		while(it.hasNext()){
			String s = (String)it.next();
			if(s.contains("czm")){
				c.add("xn");//Exception in thread "main" java.util.ConcurrentModificationException
			}
		}
		
		*/
		System.out.println(c);
		ListIterator lit = c.listIterator();
		
		while(lit.hasNext()){
			String s = (String)lit.next();
			if(s.equals("czm")){//boolean hasNext():以正向遍历列表时，如果列表迭代器有多个元素，则返回 true
				lit.add("xn");
				//System.out.println();
			}
		}
		System.out.println(c);
	}

	private static void method() {
		Collection c = new ArrayList();
		
		c.add("xcm");
		c.add("xgd");
		c.add("czm");
		
		if(c.contains("xn")){
			c.add("xn");
		}
		
		System.out.println(c);
	}

}
