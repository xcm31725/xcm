package com.itheima;

public class StudentDemo01 {

	public static void main(String[] args) {
		//��������
		Student s = new Student();
		
		//����Ա������ֵ
		s.age = 23;
		s.name = "����";
		
		System.out.println("������"+s.name);
		System.out.println("���䣺"+s.age);
		
		//���ó�Ա����
		s.eat();
		s.study();

	}

}


