package com.list;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add("weiqiang");
		list.add("shuini");
		
		//��0�������Ԫ��
		list.addFirst("liba");
		//��size()-1�������Ԫ��
		list.addLast("zalan");
		
		System.out.println(list);
		
		//��ȡ0������Ԫ��
		System.out.println(list.getFirst());
		//��ȡsize()-1������Ԫ��
		System.out.println(list.getLast());
		System.out.println("-------------------");
		
		//ɾ��0������Ԫ�ز�����
		System.out.println(list.removeFirst());
		//ɾ��size()-1������Ԫ�ز�����
		System.out.println(list.removeLast());
		
		System.out.println(list);
	}

}
