package com.itheima02;

import java.util.ArrayList;

/*
 * 3.按需求完成指定功能，题目如下（12分）
	 定义User类，包含属性：
                  name: String类型
          age   : int类型
	创建一个ArrayList集合对象list，集合内元素类型为User，
	实例化3个User对象，3个对象的属性分别为 ：”张三” 20， ”李四” 30， ”王五” 40，
	将3个对象添加到list集合中，并使用for循环遍历集合，将集合中age属性大于30的元素属性在控制台打印出来。

 * */
public class Test3 {
	public static void main(String[] args) {
		ArrayList<User> list = new ArrayList<User>();
		
		list.add(new User("张三",20));
		list.add(new User("李四",30));
		list.add(new User("王五",40));
		
		for (int i = 0; i < list.size(); i++) {
			User u = list.get(i);
			
			if(u.getAge()>30){
				System.out.println(u.getName()+"\t"+u.getAge());
			}
		}
	}
}
