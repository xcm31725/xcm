package com.itheima_01;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		String str = "xcm,xxn,xka,xtx";
		String[] shs = str.split(",");
		
		ArrayList<String> array = new ArrayList<String>();
		
		for (int i = 0; i < shs.length; i++) {
			String s = shs[i];
			array.add(s);
		}
//		array.add("xcm");
//		array.add("xxn");
//		array.add("xke");
//		array.add("xtx");
		
		for(int i=0;i<array.size();i++){
			String s = array.get(i);
			System.out.println(s);
		}
	}
}
