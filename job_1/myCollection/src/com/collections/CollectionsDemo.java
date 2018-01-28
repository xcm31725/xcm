package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Collections:
 * 
 * �����⣺Collection��Collections��ʲôȥ��
 * 		Collection�Ǽ��ϵ���ϵ��߶��㣬����������ϵ�Ĺ���
 * 		Collections��һ�������࣬�����������ڲ���Collection
 * */
public class CollectionsDemo {

	public static void main(String[] args) {
		//method();
		//method1();
		//method2();
		//method3();
		//method4();
		//static void sort(List list) �����б���Ԫ�ص���Ȼ˳���������
		List list = new ArrayList();
		
		list.add(2);
		list.add(1);
		list.add(4);
		list.add(3);
		
		Collections.sort(list);
		System.out.println(list);
	}


	private static void method4() {
		//static void shuffle(List list)ɵ������û�
		List<String> src = new ArrayList<String>();
		
		src.add("xcm");
		src.add("czm");
		src.add("xhd");
		
		Collections.shuffle(src);
		System.out.println(src);
	}


	private static void method3() {
		//static void reverse(List<?> list) ��ת
		List<String> src = new ArrayList<String>();
		
		src.add("xcm");
		src.add("czm");
		src.add("xhd");	
		
		Collections.reverse(src);
		System.out.println(src);
	}


	private static void method2() {
		//static void fill(List list, T obj) ʹ��ָ���������ָ���б��Ԫ�� 
		List<String> src = new ArrayList<String>();
		
		src.add("xcm");
		src.add("czm");
		src.add("xhd");
		
		Collections.fill(src, "xcm");
		System.out.println(src);
	}
	

	private static void method1() {
		//static void copy(List dest, List src) ��Դ�б���Ԫ�ظ��ǵ�Ŀ���б�
		//ע�⣺Ŀ���б�ĳ������ٵ���Դ�б�ĳ���
		List<String> src = new ArrayList<String>();
		
		src.add("xcm");
		src.add("czm");
		src.add("xhd");
		
		List<String> dest = new ArrayList<String>();
		dest.add("ss");
		dest.add("ss");
		dest.add("ss");
		dest.add("ss");
		
		Collections.copy(dest, src);
		System.out.println(dest);
	}

	private static void method() {
		//static int binarySearch(List list, T key) ʹ�ö��ֲ��ҷ�����ָ��Ԫ����ָ���б������λ�� 
		List list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(Collections.binarySearch(list, 3));
	}

}
