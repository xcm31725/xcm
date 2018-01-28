package com.itheima_02;

public class BasicTeacher extends Teacher{
	
	public BasicTeacher() {
		super();
	}

	public BasicTeacher(String name, int age, String gender) {
		super(name, age, gender);
	}

	@Override
	public void teach() {
		System.out.println(getName()+"½²JavaSE");
		
	}
	
}
