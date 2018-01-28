package com.itheima;

public class JiuYeTeacher extends Teacher implements PlayBasketball{
	
	public JiuYeTeacher() {
		super();
	}

	public JiuYeTeacher(String name, int age) {
		super(name, age);
	}

	@Override
	public void teach() {
		System.out.println("就业班的"+getName()+"老师讲JavaEE");
	}

	@Override
	public void playBasketball() {
		System.out.println("打篮球");
		
	}

}
