package com.list;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add("weiqiang");
		list.add("shuini");
		
		//给0索引添加元素
		list.addFirst("liba");
		//给size()-1索引添加元素
		list.addLast("zalan");
		
		System.out.println(list);
		
		//获取0索引的元素
		System.out.println(list.getFirst());
		//获取size()-1索引的元素
		System.out.println(list.getLast());
		System.out.println("-------------------");
		
		//删除0索引的元素并返回
		System.out.println(list.removeFirst());
		//删除size()-1索引的元素并返回
		System.out.println(list.removeLast());
		
		System.out.println(list);
	}

}
