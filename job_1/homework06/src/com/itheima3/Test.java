package com.itheima3;

import java.util.ArrayList;

/*
 * 3、将ArrayList里的元素进行反转
		提示:
			回顾数组中是如何进行元素反转的,类比着数组元素反转做集合元素的反转
 * */
public class Test {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("xcm");
		list.add("ch");
		list.add("gd");
		list.add("wq");
		
		for(int i=list.size()-1; i>=0; i--){
			System.out.println(list.get(i));
		}
	}

}
