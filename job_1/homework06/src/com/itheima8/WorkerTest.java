package com.itheima8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 8、分析以下需求，并用代码实现：
		(1)定义一个Worker类型(属性私有、空参有参构造、set、get方法、toString方法)，
			包含三个属性：姓名(String name)、年龄(int age)、工资(double salary),
			在Worker类中定义work方法打印一句话，
			如："凤姐 正在工作"，其中"凤姐"代表当前对象的姓名
		(2)定义List集合，在List集合中增加三个员工，基本信息如下：
			"凤姐" 18 20000
			"欧阳峰" 60 8000
			"刘德华" 40 30000
		(3)在"欧阳峰"之前插入一个员工，信息为：姓名："张柏芝"，年龄：35，工资3300
		(4)删除"刘德华"的信息
		(5)利用for 循环遍历，打印List 中所有员工的信息
		(6)利用迭代遍历，对List 中所有的员工调用work 方法
 * */
public class WorkerTest {

	public static void main(String[] args) {
		List<Worker> list = new ArrayList<Worker>();
		
		list.add(new Worker("凤姐",18,20000));
		list.add(new Worker("欧阳峰",60,8000));
		list.add(new Worker("刘德华",40,30000));
		
		list.add(1, new Worker("张柏芝",35,3300));
		
		list.remove(3);
		
		//使用for循环遍历集合
		for (int i = 0; i < list.size(); i++) {
			Worker w = list.get(i);
			System.out.println(w);
		}
		
		System.out.println("-----------------");
		
		//使用迭代器遍历集合
		Iterator<Worker> it = list.iterator();
		
		while(it.hasNext()){
			it.next().work();
		}
	}

}
