package com.itheima_01;

import java.util.ArrayList;

public class ArrayListDemo01 {
	public static void main(String[] args) {
		
		//创建集合
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("xcm");
		array.add("xxn");
		array.add("xca");
		array.add("xtx");
		
		System.out.println("array:"+array);
		//System.out.println("get:"+array.get(0));
		//System.out.println("get:"+array.get(1));
		//System.out.println("get:"+array.get(2));
		//System.out.println("get:"+array.get(3));
		
		//System.out.println("size:"+array.size());
		
		//System.out.println("remove:"+array.remove("xtx"));
		//System.out.println("remove:"+array.remove("xtx"));
		
		//System.out.println("remove:"+array.remove(3));
		
		System.out.println("set:"+array.set(3, "xgd"));
		System.out.println(array);
	}
}
