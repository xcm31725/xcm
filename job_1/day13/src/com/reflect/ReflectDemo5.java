package com.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 
 * @ClassName: ReflectDemo5  
 * @Description: TODO
 * 
 * Class
 * 		 Method getDeclaredMethod(String name, Class<?>... parameterTypes) 
 * 		 Method[] getDeclaredMethods() 
 * 
 * Method
 * 		Object invoke(Object obj, Object... args) 
 * @author sudong
 * @date 2018年1月26日 上午11:44:10  
 *
 */
public class ReflectDemo5 {

	public static void main(String[] args) throws ReflectiveOperationException {
		Class clazz = Class.forName("com.reflect.Student");
		
		Object stu = clazz.newInstance();
		
		//method1(clazz, stu);
		//method2(clazz, stu);
		Method m = clazz.getMethod("getName");
		System.out.println(m.invoke(stu));
		System.out.println(stu);
	}

	private static void method2(Class clazz, Object stu)throws ReflectiveOperationException {
		Method m = clazz.getMethod("setName", String.class);
		
		m.invoke(stu, "zzc");
		System.out.println(stu);
	}

	private static void method1(Class clazz, Object stu) throws ReflectiveOperationException {
		Method m = clazz.getMethod("show");
		
		m.invoke(stu);
	}

}
