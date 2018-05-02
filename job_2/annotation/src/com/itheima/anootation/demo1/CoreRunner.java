package com.itheima.anootation.demo1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName: CoreRunner  
 * @Description: TODO 核心运行类
 * @author sudong
 */
public class CoreRunner {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		/**
		 * 获得测试类的Class
		 * 获得Class中的所有的方法
		 * 遍历每个方法，查看每个方法上是否有MyText注解
		 * 有MyText注解，这个方法就执行
		 */
		Class clazz = AnootationDemo1.class;
		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			boolean flag = method.isAnnotationPresent(MyTest.class);
			System.out.println(method.getName()+ "     " + flag);
			if(flag) {
				method.invoke(clazz.newInstance(), null);
			}
		}
	}
}
