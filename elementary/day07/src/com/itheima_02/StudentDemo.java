package com.itheima_02;

public class StudentDemo {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("xcm");
		s.setAge(18);
		System.out.println(s.getName()+"---"+s.getAge());

		Student s1 = new Student("Xcm",17);
		s1.show();
	}

}
