package com.itheima;

public class JiChuTeacher extends Teacher {
	
	public JiChuTeacher() {
		super();
	}

	public JiChuTeacher(String name, int age) {
		super(name, age);
	}

	@Override
	public void teach() {
		System.out.println("基础班的"+getName()+"老师讲JavaSE");

	}

}
