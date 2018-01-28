package com.reflect;

public class ReflectDemo1 {

	public static void main(String[] args) throws ClassNotFoundException {
		//通过Object中的getClass()方法获取字节码对象
		Student s = new Student();
		Object clazz1 = s.getClass();
		//通过类名来获取字节码对象
		Object clazz2 = Student.class;
		
		//通过Class中的静态方法forName(String str)来获取字节码对象
		Class clazz3 = Class.forName("com.reflect.Student");
		
		System.out.println(clazz1 == clazz2);
		System.out.println(clazz1 == clazz3);
		System.out.println(clazz1);
	}

}
