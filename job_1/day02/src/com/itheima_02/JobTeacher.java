package com.itheima_02;

public class JobTeacher extends Teacher {
	
	public JobTeacher() {
		super();
	}

	public JobTeacher(String name, int age, String gender) {
		super(name, age, gender);
	}

	@Override
	public void teach(){
		System.out.println(getName()+"Ω≤Ω‚JavaEE");
	}
}
