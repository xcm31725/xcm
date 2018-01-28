package com.foreach;

import java.util.ArrayList;
import java.util.Collection;

/*
 * foreach：增强for循环，一般用于遍历集合或者数组
 * 
 * 格式：
 * 		for(元素的类型 变量：集合或者数组对象){
 * 			可以直接使用变量
 * 		}
 * 注意：在增强for循环中不能修改集合，否则会出现并发修改异常
 * */
public class ForEachDemo {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		
		c.add("xcm");
		c.add("xgd");
		c.add("xn");
		
		for (String string : c) {
			c.add("xtx");// java.util.ConcurrentModificationException ： 并发修改异常
			System.out.println(string);
		}
	}

}
