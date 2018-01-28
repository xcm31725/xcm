package com.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ���ϵı�����ʽ��
 * 		1. toArray()�����԰Ѽ���ת�������飬Ȼ���������
 * 		2. iterator()�����Է���һ���������������ǿ���ͨ�������������������
 * 
 * Itator���������ڱ�������
 * 		E next() ��������һ��Ԫ��
 * 		boolean hasNext() ���ж��Ƿ���Ԫ�ؿ��Ի�ȡ
 * 
 * ע�⣺Exception in thread "main" java.util.NoSuchElementException
 * 		ʹ��next������ȡ��һ��Ԫ�أ����û��Ԫ�ؿ��Ի�ȡ������֣�NoSuchElementException
 * */
public class IteratorDemo {

	public static void main(String[] args) {
		//�������϶���
		Collection c = new ArrayList();
		
		c.add("hello");
		c.add("world");
		c.add("java");
		//��ȡ����������
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
