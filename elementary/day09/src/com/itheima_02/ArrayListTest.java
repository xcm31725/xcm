package com.itheima_02;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		//�������϶���
		ArrayList<Student> array = new ArrayList<Student>();
		
		//����ѧ������
		Student s = new Student("xcm",17);
		Student s1 = new Student("xka",18);
		Student s2 = new Student("xxn",17);
		Student s3 = new Student("xtx",18);
		
		//���������Ԫ��
		array.add(s);
		array.add(s1);
		array.add(s2);
		array.add(s3);
		
		for (int i = 0; i < array.size(); i++) {
			Student str = array.get(i);
			
			System.out.println(str.getName()+"---"+str.getAge());
		}
	}
}
