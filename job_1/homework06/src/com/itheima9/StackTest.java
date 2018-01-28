package com.itheima9;

import java.util.LinkedList;

/*
 * 9、定义一个类,该类可以存储字符串元素,该类的特点是先进后出(栈的特点)
		(1)定义一个类 Stack
		(2)提供进栈的方法 in(String str)
		(2)提供出栈的方法 String out() : 每一次调用该方法,对象中的元素就少一个
		(3)提供获取元素的个数的方法 int size()
 * */
public class StackTest {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		in(list,"xcm");
		in(list,"sd");
		in(list,"zc");
		System.out.println(list);
		out(list);
		System.out.println(list);
		
		System.out.println(list.size());
	}
	
	public static void in(LinkedList<String> list,String str){
		//LinkedList<String> list = new LinkedList<String>();
		list.addFirst(str);
	}
	
	public static String out(LinkedList<String> list){
		//LinkedList<String> list = new LinkedList<String>();
		return list.removeFirst();	
	}

}
