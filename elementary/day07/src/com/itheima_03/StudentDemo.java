package com.itheima_03;

public class StudentDemo {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("XCM");
		s.setAge(18);
		
		System.out.println("�ҵ������ǣ�"+s.getName()+",�ҵ������ǣ�"+s.getAge());
		
		Student s1 = new Student("XGD",22);
		
		System.out.println("�ҵ������ǣ�"+s1.getName()+",�ҵ������ǣ�"+s1.getAge());
	}

}
