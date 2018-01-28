package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 
 * @ClassName: ReflectDemo2  
 * @Description: TODO
 * Class
 *  	Constructor<T> getConstructor(Class<?>... parameterTypes) 
 *  	Constructor<?>[] getConstructors() 
 *  	T newInstance() 
 *  Constructor
 *  	T newInstance(Object... initargs) 
 * 
 * @author sudong
 * @date 2018年1月26日 上午10:00:15  
 *
 */
public class ReflectDemo2 {

	public static void main(String[] args) throws ReflectiveOperationException {
		Class clazz = Class.forName("com.reflect.Student");
		
		//method1(clazz);
		//method2(clazz);
		//method3(clazz);
		
		Object obj = clazz.newInstance();
		System.out.println(obj);
	}

	private static void method3(Class clazz)
			throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
		//Constructor<T> getConstructor(Class<?>... parameterTypes) 
		Constructor con = clazz.getConstructor(String.class, int.class);
		Object obj = con.newInstance("xcm",17);
		System.out.println(obj);
	}

	private static void method2(Class clazz)
			throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
		//Constructor<T> getConstructor(Class<?>... parameterTypes) 
		Constructor con = clazz.getConstructor();
		Object c = con.newInstance();
		
		System.out.println(c);
	}

	private static void method1(Class clazz) {
		//Constructor<?>[] getConstructors() 
		Constructor[] con = clazz.getConstructors();
		for (int s = 0; s < con.length; s++) {
			System.out.println(con[s]);
		}
	}

}
