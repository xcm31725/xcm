package com.itheima_01;

import java.util.ArrayList;

public class ArrayListTest01 {
	public static void main(String[] args) {
		String[] arrArray = {"xcm","xka","zc","gd","xn"};
		
		//创建集合
		ArrayList<String> array = new ArrayList<String>();
		
		//遍历数组并把数组中的元素添加到集合中
		for (int i = 0; i < arrArray.length; i++) {
			array.add(arrArray[i]);
		}
		
		//输出已x开头的
		/*for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);
			
			if(s.startsWith("x")){
				System.out.println(s);
			}
			
		}*/
		
		//删除已x开头的
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);
			
			if(s.startsWith("x")){
				array.remove(i);
				i--;
			}
		}
		
		System.out.println(array);
	}
}
