package com.itheima9;

import java.util.LinkedList;

/*
 * 9������һ����,������Դ洢�ַ���Ԫ��,������ص����Ƚ����(ջ���ص�)
		(1)����һ���� Stack
		(2)�ṩ��ջ�ķ��� in(String str)
		(2)�ṩ��ջ�ķ��� String out() : ÿһ�ε��ø÷���,�����е�Ԫ�ؾ���һ��
		(3)�ṩ��ȡԪ�صĸ����ķ��� int size()
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
