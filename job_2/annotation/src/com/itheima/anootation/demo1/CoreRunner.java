package com.itheima.anootation.demo1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName: CoreRunner  
 * @Description: TODO ����������
 * @author sudong
 */
public class CoreRunner {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		/**
		 * ��ò������Class
		 * ���Class�е����еķ���
		 * ����ÿ���������鿴ÿ���������Ƿ���MyTextע��
		 * ��MyTextע�⣬���������ִ��
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
