package com.itheima5;

import java.util.ArrayList;
import java.util.List;

/*
 * 5�������������󣬲��ô���ʵ�֣�
		(1)����һ��Person����(����˽�С��ղ��вι��졢set��get������toString����)��
			�����������ԣ�����(String name)������(int age)
		(2)List�����д洢���Person����,��ȡ��������Person���󲢴�ӡ��Ϣ
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
