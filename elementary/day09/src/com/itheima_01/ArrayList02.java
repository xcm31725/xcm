package com.itheima_01;

import java.util.ArrayList;

public class ArrayList02 {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("xcm");
		array.add("xxn");
		array.add("xke");
		array.add("xtx");
		
		for(int i=0;i<array.size();i++){
			String s = array.get(i);
			System.out.println(s);
		}
	}
}
