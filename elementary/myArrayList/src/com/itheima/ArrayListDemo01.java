package com.itheima;

import java.util.ArrayList;

/*
 * Ϊʲô����ּ����أ�
 * 
 * ��ΪStringBuilderֻ�ܴ洢һ���ַ�����һ��������Ҫ��
 * �����Ƕ�������Ӧ���˱仯��Ҫ��
 * 
 * ��������ص㣺
 * 		���ȿɱ䡣
 * ArrayList<E>:
 * 		��С�ɱ������ʵ��
 * 		
 * 		<E>����һ��������������ͣ����͡�
 * 		ʹ�ã�ArrayList<String>��ArrayList<student>
 * 
 * ���Ԫ�أ�
 * 		public boolean add(E e):���Ԫ��
 * 		public void add(int index,E element):��ָ��λ�����һ��Ԫ��
 * */
public class ArrayListDemo01 {
	public static void main(String[] args) {
		//��������
		ArrayList<String> array = new ArrayList<>();
		
		//add(E e):���Ԫ��
		array.add("hello");
		array.add("world");
		array.add("java");
		System.out.println("array:"+array);
		System.out.println("-------------");
		
		
		//add(int index,E element):��ָ��λ�����һ��Ԫ��
		array.add(1, "nihao");
		array.add(3, "ma");
		array.add(5, "yuyan");
		System.out.println("array:"+array);
	}
}















