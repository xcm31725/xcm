package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteatorDemo {

	public static void main(String[] args) {
		//Collection c = new ArrayList();
		List c = new ArrayList();
		
		c.add("xcm");
		c.add("xgd");
		c.add("xxn");
		
		/*Iterator it = c.iterator();
		
		while(it.hasNext()){
			String s = (String)it.next();
			if(s.equals("xxn")){
				c.add("czm");//Exception in thread "main" java.util.ConcurrentModificationException：并发修改异常
			}
		}*/
		
		ListIterator lit = c.listIterator();
		
		while(lit.hasNext()){
			String s = (String)lit.next();
			if(s.equals("xxn")){
				lit.add("xtx");
			}
		}
		
		System.out.println(c);
	}

}
