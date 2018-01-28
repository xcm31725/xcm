package com.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List l = new ArrayList();
		
		//在指定索引处添加元素
		l.add(0, "xcm");
		l.add(0, "xgd");
		l.add(1, "czm");
		
		/*for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}*/
		System.out.println(l);
		
		System.out.println("-----------");
		//删除指定元素
		//System.out.println(l.remove(1));
		
		//修改指定索引的元素，并返回这个元素
		System.out.println(l.set(1, "xgs"));
		/*for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}*/
		System.out.println(l);
		
	}

}
