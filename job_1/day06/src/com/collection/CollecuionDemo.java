package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollecuionDemo {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		c.add("xcm");
		c.add("xgd");
		
		for (Object obj : c) {
			System.out.println(obj);
		}
		System.out.println("-----------------");
		
		/*c.remove("xcm");
		for (Object obj : c) {
			System.out.println(obj);
		}*/
		
		/*c.clear();
		for (Object obj : c) {
			System.out.println(obj);
		}*/
		
		System.out.println(c.contains("xn"));
		
		System.out.println("---------------");
		
		//System.out.println(c.isEmpty());
		
		Object[] array = c.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
