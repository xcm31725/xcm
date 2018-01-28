package com.list;

import java.util.LinkedList;

/*
 * List�ĳ������ࣺ
 * 		ArrayList
 * 			�ײ�������ṹ����ѯ�죬��ɾ��
 * 		LinkedList
 * 			�ײ�ṹ��������ѯ�죬��ɾ��
 * 
 * ���ѡ��ʹ�ò�ͬ�ļ���
 * 		�����ѯ�࣬��ɾ�٣���ʹ��ArrayList
 * 		�����ѯ�٣���ɾ�࣬��ʹ��LinkedList
 * 		�����֪������ʲô������ArrayList
 * LinkedList�����й��ܣ�
 * 		void addFirst(E e) 
 * 		void addLast(E e) 
 * 		E getFirst() 
 * 		E getLast() 
 * 		E removeFirst() 
 * 		E removeLast() 
 * 		
 
 * 		
 * */
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add("xcm");
		list.add("xgd");
		
		//void addFirst(E e) :��Ԫ������ӵ�0����λ��
		//void addLast(E e) ����Ԫ����ӵ�size()-1����λ��
		list.addFirst("xtx");
		list.addLast("xdd");
		
		//E getFirst() ����ȡ����Ϊ0��Ԫ��
		//E getLast()����ȡ����Ϊsize()-1��Ԫ��
		//System.out.println(list.getFirst());
		//System.out.println(list.getLast());
		
		//E removeFirst() ��ɾ������Ϊ0��Ԫ��
		//E removeLast() ��ɾ������Ϊsize()-1��Ԫ�ز�����
		System.out.println(list.removeFirst());
		System.out.println(list.removeLast());
		
		System.out.println(list);
	}

}
















