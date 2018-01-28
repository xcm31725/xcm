package com.reflect;

import java.lang.reflect.Field;

/**
 * 
 * @ClassName: ReflectDemo3  
 * @Description: TODO
 * 
 * Class
 * 		Field getField(String name) 
 * 		Field[] getFields() 
 * 
 * Field
 * 		void set(Object obj, Object value) 
 * 		Object get(Object obj) 
 * @author sudong
 * @date 2018年1月26日 上午10:42:19  
 *
 */
public class ReflectDemo3 {

	public static void main(String[] args) throws ReflectiveOperationException {
		Class clazz = Class.forName("com.reflect.Student");
		
		Object stu = clazz.newInstance();
		
		Field f = clazz.getField("name");
		//f.setAccessible(true);
		f.set(stu, "zzc");
		Object name = f.get(stu);
		System.out.println(name);
	}

	private static void method2(Class clazz, Object stu) throws NoSuchFieldException, IllegalAccessException {
		//method1(clazz, stu);
		
		Field fil = clazz.getField("age");
		//Object obj1 = fil.get(sut);
		//System.out.println(fil);
		fil.set(stu, 17);
		Object age = fil.get(stu);
		System.out.println(age);
		
		System.out.println(stu);
	}

	private static void method1(Class clazz, Object stu) {
		Field[] fil = clazz.getFields();
		for (int i = 0; i < fil.length; i++) {
			System.out.println(fil[i]);
		}
		
		//System.out.println(stu);
		System.out.println("------------");
		Field[] fil1 = clazz.getDeclaredFields();
		for (int i = 0; i < fil1.length; i++) {
			System.out.println(fil1[i]);
		}
		System.out.println(stu);
	}

}
