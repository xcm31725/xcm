package com.arraylist;

public class MyArrayLIstDemo {

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		
		list.add("hello");
		list.add("world");
		list.add("�Ի�");
		
		for (int i = 0; i < list.size(); i++) {
			Object o = list.git(i);
			System.out.println(o);
		}
		
		System.out.println("---------------");
		
		list.set(1, "����è");
		
		for (int i = 0; i < list.size(); i++) {
			Object o = list.git(i);
			System.out.println(o);
		}
		
		System.out.println("---------------");
		
		list.remove(1);
		
		for (int i = 0; i < list.size(); i++) {
			Object o = list.git(i);
			System.out.println(o);
		}
	}

}
