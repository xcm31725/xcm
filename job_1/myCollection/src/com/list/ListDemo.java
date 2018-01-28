package com.list;

import java.util.ArrayList;
import java.util.List;

/*
 * List:
 * 		����ģ�����Ͷ�ȡ��˳����һ�µģ�
 * 		����������
 * 		�����ظ���
 * 
 * List�����й��ܣ�
 * 		 void add(int index, E element) 
 * 		 E get(int index) 
 * 		 E remove(int index)  
 * 		 E set(int index, E element) 
 * */
public class ListDemo {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		
		//void add(int index, E element):��ָ���������Ԫ��
		l.add(0,"xcm");
		l.add(0, "xgd");
		l.add(1, "xn");
		
		//System.out.println(l);
		for (String string : l) {
			System.out.println(string);
		}
		
		System.out.println("--------------");
		//E set(int index, E element) ���޸�ָ��������Ԫ��
		l.set(1, "xtx");
		for (String string : l) {
			System.out.println(string);
		}
		System.out.println("--------------");
		// E remove(int index) ��ɾ��ָ��Ԫ�ز����ظ�Ԫ�� 
		l.remove(1);
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		
	}

}
