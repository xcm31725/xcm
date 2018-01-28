package com.mybeanutils;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;

public class MyBeanUtils {
	private MyBeanUtils() {}
	//setProperty	populate
	public static void setProperty(Object bean, String name, Object value) throws ReflectiveOperationException {
		Class clazz = bean.getClass();
		Field f = clazz.getDeclaredField(name);
		f.setAccessible(true);
		f.set(bean, value);
	}
	
	public static String getProperty(Object bean, String name) throws ReflectiveOperationException {
		Class clazz = bean.getClass();
		Field f = clazz.getDeclaredField(name);
		f.setAccessible(true);
		Object obj = f.get(bean);
		return obj.toString();
	}
	
	public static void populate(Object bean, Map map) throws ReflectiveOperationException {
		Class clazz = bean.getClass();
		
		Set keys = map.keySet();
		for (Object key : keys) {
			try{
				Field f = clazz.getDeclaredField(key.toString());
				Object value = map.get(key);
				f.setAccessible(true);
				//f.get(map);
				f.set(bean, value);
			} catch(Exception e) {
				
			}
		}
	}
}














