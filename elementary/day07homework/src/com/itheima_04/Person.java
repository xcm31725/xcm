package com.itheima_04;

public class Person {

	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.setAge(30);
		t.setName("��־��");
		t.setContent("Java�������������");
		t.eat();
		t.jiangKe();
		
		Student s = new Student();
		s.setAge(18);
		s.setName("����");
		s.setContent("�������");
		s.eat();
		s.study();
	}

}
