package com.itheima9;

import java.util.LinkedList;

/*
 *  (1)����һ���� Stack
	(2)�ṩ��ջ�ķ��� in(String str)
	(2)�ṩ��ջ�ķ��� String out() : ÿһ�ε��ø÷���,�����е�Ԫ�ؾ���һ��
	(3)�ṩ��ȡԪ�صĸ����ķ��� int size()
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
