package com.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		c.add("xcm");
		c.add("xgd");
		c.add("czm");
		
		Iterator it = c.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
