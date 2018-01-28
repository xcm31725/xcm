package com.itheima9;

import java.util.LinkedList;

/*
 *  (1)定义一个类 Stack
	(2)提供进栈的方法 in(String str)
	(2)提供出栈的方法 String out() : 每一次调用该方法,对象中的元素就少一个
	(3)提供获取元素的个数的方法 int size()
 * */
public class Stack {
	private int count = 0;
	public void in(String str){
		LinkedList<String> list = new LinkedList<String>();
		list.addFirst(str);
	}
	
	public String out(){
		LinkedList<String> list = new LinkedList<String>();
		return list.removeLast();	
	}
	
	public int size(){
		return count;
	}
}
