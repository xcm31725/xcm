package com.reflect;

import java.lang.reflect.Field;

public class ReflectDemo4 {
	public static void main(String[] args) throws ReflectiveOperationException {
		Class clazz = Class.forName("com.reflect.Student");
		
		Object stu = clazz.newInstance();
		
		//Field f = clazz.getDeclaredField("name");
		Field f = clazz.getDeclaredField("name");
		
		f.setAccessible(true);
		f.set(stu, "zzc");
		System.out.println(f.get(stu));
		
		System.out.println(stu);
	}
}
