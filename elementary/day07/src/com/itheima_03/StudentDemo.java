package com.itheima_03;

public class StudentDemo {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("XCM");
		s.setAge(18);
		
		System.out.println("我的名字是："+s.getName()+",我的年龄是："+s.getAge());
		
		Student s1 = new Student("XGD",22);
		
		System.out.println("我的名字是："+s1.getName()+",我的年龄是："+s1.getAge());
	}

}
