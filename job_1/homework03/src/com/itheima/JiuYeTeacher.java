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
		System.out.println("��ҵ���"+getName()+"��ʦ��JavaEE");
	}

	@Override
	public void playBasketball() {
		System.out.println("������");
		
	}

}
