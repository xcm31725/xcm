package com.itheima_01;
/*
 * 泛型：用来规定集合中元素的数据类型
 * 泛型就是广泛数据类型，除了基本数据类型外，其他的数据类型都可以当成泛型
 * 新特性：左的泛型不能省略，而右边的泛型可以省略，建议不要生了省略*/

import java.util.ArrayList;
public class ArrayListDemo {
	
	public static void main(String[] args) {
		//创建集合
		ArrayList<String> array = new ArrayList<String>();
		
		//给集合添加元素
		array.add("xcm");
		array.add("xka");
		array.add("xgd");

		System.out.println("array:"+array);

	}

}
