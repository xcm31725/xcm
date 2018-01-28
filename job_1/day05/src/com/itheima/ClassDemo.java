package com.itheima;

public class ClassDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		Student s = new Student();
		Class clazz = s.getClass();
		System.out.println(clazz);
		Class clazz1 = Student.class;
		System.out.println(clazz1);
		Class clazz2 = Class.forName("com.itheima.Student");
		System.out.println(clazz2);
	}

}
