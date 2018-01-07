package com.itheima;

import java.util.ArrayList;

/*
 * 获取元素
 * 		public E get(int index)：返回指定索引处的元素
 * 集合长度
 * 		public int size()：返回集合中元素的个数
 * 删除元素
 * 		public boolean remove(Object o)：删除指定的元素，并返回是否成功
 * 		public E remove(int index)：删除指定索引位置的元素，并返回这个元素
 * 修改元素
 * 		public E set(int index,E element):修改指定索引位置的元素，并返回这个元素
 * */
public class ArrayLiDemo02 {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		
		//add(E e):添加元素
		array.add("hello");
		array.add("world");
		array.add("java");
		
		//public E get(int index)：返回指定索引处的元素
//		System.out.println("get:"+array.get(1));
		
		//public int size()：返回集合中元素的个数
//		System.out.println("size:"+array.size());
		
		//public boolean remove(Object o)：删除指定的元素，并返回是否成功
//		System.out.println("remove:"+array.remove("world"));
//		System.out.println("remove:"+array.remove("world"));
		
		//public E remove(int index)：删除指定索引位置的元素，并返回这个元素
//		System.out.println("remove:"+array.remove(1));
		
		//public E set(int index,E element):修改指定索引位置的元素，并返回这个元素
		System.out.println("set:"+array.set(2, "andriod"));
		
		//输出集合元素
		System.out.println("array:"+array);
	}

}
