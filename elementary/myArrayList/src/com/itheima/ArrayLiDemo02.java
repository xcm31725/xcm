package com.itheima;

import java.util.ArrayList;

/*
 * ��ȡԪ��
 * 		public E get(int index)������ָ����������Ԫ��
 * ���ϳ���
 * 		public int size()�����ؼ�����Ԫ�صĸ���
 * ɾ��Ԫ��
 * 		public boolean remove(Object o)��ɾ��ָ����Ԫ�أ��������Ƿ�ɹ�
 * 		public E remove(int index)��ɾ��ָ������λ�õ�Ԫ�أ����������Ԫ��
 * �޸�Ԫ��
 * 		public E set(int index,E element):�޸�ָ������λ�õ�Ԫ�أ����������Ԫ��
 * */
public class ArrayLiDemo02 {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		
		//add(E e):���Ԫ��
		array.add("hello");
		array.add("world");
		array.add("java");
		
		//public E get(int index)������ָ����������Ԫ��
//		System.out.println("get:"+array.get(1));
		
		//public int size()�����ؼ�����Ԫ�صĸ���
//		System.out.println("size:"+array.size());
		
		//public boolean remove(Object o)��ɾ��ָ����Ԫ�أ��������Ƿ�ɹ�
//		System.out.println("remove:"+array.remove("world"));
//		System.out.println("remove:"+array.remove("world"));
		
		//public E remove(int index)��ɾ��ָ������λ�õ�Ԫ�أ����������Ԫ��
//		System.out.println("remove:"+array.remove(1));
		
		//public E set(int index,E element):�޸�ָ������λ�õ�Ԫ�أ����������Ԫ��
		System.out.println("set:"+array.set(2, "andriod"));
		
		//�������Ԫ��
		System.out.println("array:"+array);
	}

}
