package com.reflect;

public class ReflectDemo1 {

	public static void main(String[] args) throws ClassNotFoundException {
		//ͨ��Object�е�getClass()������ȡ�ֽ������
		Student s = new Student();
		Object clazz1 = s.getClass();
		//ͨ����������ȡ�ֽ������
		Object clazz2 = Student.class;
		
		//ͨ��Class�еľ�̬����forName(String str)����ȡ�ֽ������
		Class clazz3 = Class.forName("com.reflect.Student");
		
		System.out.println(clazz1 == clazz2);
		System.out.println(clazz1 == clazz3);
		System.out.println(clazz1);
	}

}
