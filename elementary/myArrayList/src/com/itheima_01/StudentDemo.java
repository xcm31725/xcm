package com.itheima_01;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ����һ�����ϣ��洢ѧ������ѧ����������������ڼ���¼�룬����������
 * 		������
 * 			����¼��ѧ������
 * 			����һ��ѧ����
 * 			
 * */
public class StudentDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> array = new ArrayList<Student>();
		
		printArray(array);
		printArray(array);
		printArray(array);
		
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i).getName()+"-----"+array.get(i).getAge());
		}
	}
	
	public static void printArray(ArrayList<Student> array){
		//��������¼��
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���������֣�");
		String name = sc.next();
		
		System.out.println("���������䣺");
		int age = sc.nextInt();
		
		Student s = new Student();
		s.setName(name);
		s.setAge(age);
		
		array.add(s);
	}

}
