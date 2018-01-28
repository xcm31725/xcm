package com.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ʹ�ü��ϴ��Զ�����󲢱���
 * ���ڼ��Ͽ��Դ洢�������͵Ķ��󣬵����Ǵ洢�˲�ͬ���͵ĵĶ��󣬾��п�����ת����ʱ�����ת���쳣
 * ����javaΪ�˽��������⣬�������ṩ��һ�ֻ��ƣ��з���
 * ���ͣ���һ�ֹ㷺�����ͣ�����ȷ�������͵Ĺ�����ǰ���˷���ʱ�ڣ������������ص�
 * 
 * ���͵ĺô���
 * 		����������ת��������
 * 		���Լ��ٻ�ɫ����
 * 		���Լ����Ǵ������д
 * 
 * ʲôʱ�����ʹ�÷��ͣ�
 * 		�����ǿ���<E>���Ϳ���ʹ�÷�����
 * 
 * */
public class GenericDemo {

	public static void main(String[] args) {
		Collection<Student> c = new ArrayList<Student>();
		
		c.add(new Student("xcm",18));
		c.add(new Student("xgd",22));
		
		//�������϶���
		Iterator<Student> it = c.iterator();
		while(it.hasNext()){
			Student stu = it.next();
			System.out.println(stu.name);

		}
	}

}

class Student {
	String name;
	int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
