package com.itheima;
/*
 * ���ϵı���
 * 		ͨ��size()������ get()����ʵ�ֵ�
 * */
import java.util.ArrayList;

public class ArrayListDemo03 {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		
		//add(E e):���Ԫ��
		array.add("hello");
		array.add("world");
		array.add("java");
		
		for (int i = 0; i < array.size(); i++) {
			System.out.println("array:"+array.get(i));
		}
		System.out.println("-----------------");
		
		//���׼���÷�
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);//�Ƚ����£�Ϊ�˷�����в���
			System.out.println("array:"+s);
		}

	}

}
