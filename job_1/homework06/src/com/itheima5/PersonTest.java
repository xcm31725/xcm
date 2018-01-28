package com.itheima5;

import java.util.ArrayList;
import java.util.List;

/*
 * 5、分析以下需求，并用代码实现：
		(1)定义一个Person类型(属性私有、空参有参构造、set、get方法、toString方法)，
			包含两个属性：姓名(String name)、年龄(int age)
		(2)List集合中存储多个Person对象,获取年龄最大的Person对象并打印信息
 * */
public class PersonTest {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person("xcm",18));
		list.add(new Person("sg",22));
		list.add(new Person("nv",17));
		list.add(new Person("zc",16));
		list.add(new Person("bd",23));
		list.add(new Person("xgd",21));
		
		int max = 0;
		for (int i = 0; i < list.size(); i++) {
			Person p = list.get(i);
			if(p.getAge()>max){
				max = p.getAge();
			}
		}
		
		for (int i = 0; i < list.size(); i++) {
			Person p = list.get(i);
			if(p.getAge() == max){
				System.out.println(p);
			}
		}
	}
}
