package com.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 集合的遍历方式：
 * 		1. toArray()，可以把集合转换成数组，然后遍历数组
 * 		2. iterator()，可以返回一个迭代器对象，我们可以通过迭代器对象迭代集合
 * 
 * Itator：可以用于遍历集合
 * 		E next() ：返回下一个元素
 * 		boolean hasNext() ：判断是否有元素可以获取
 * 
 * 注意：Exception in thread "main" java.util.NoSuchElementException
 * 		使用next方法获取下一个元素，如果没有元素可以获取，则出现：NoSuchElementException
 * */
public class IteratorDemo {

	public static void main(String[] args) {
		//创建集合对象
		Collection c = new ArrayList();
		
		c.add("hello");
		c.add("world");
		c.add("java");
		//获取迭代器对象
		Iterator i = c.iterator();
		
		/*if(i.hasNext())
			System.out.println(i.next());
		if(i.hasNext())
			System.out.println(i.next());
		if(i.hasNext())
			System.out.println(i.next());
		if(i.hasNext())
			System.out.println(i.next());*/
		
		while((i.hasNext())){
			System.out.println(i.next());
		}
	}

}
