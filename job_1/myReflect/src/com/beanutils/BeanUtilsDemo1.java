package com.beanutils;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

/**
 * 
 * @ClassName: BeanUtilsDemo1  
 * @Description: TODO
 * 
 * static void	setProperty(Object bean, String name, Object value) 
 * static String	getProperty(Object bean, String name)
 * 
 * static void	populate(Object bean, Map properties) 
 * @author sudong
 * @date 2018年1月26日 下午3:24:47  
 *
 */
public class BeanUtilsDemo1 {

	public static void main(String[] args) throws ReflectiveOperationException {
		//method();
		Person p = new Person();
		
		Map<String, Object> map = new HashMap<String,Object>();
		
		map.put("name", "zzc");
		map.put("age", 18);
		map.put("gender", "nv");
		//map.put("birday", "2018-1-26");
		
		BeanUtils.populate(p, map);
		System.out.println(p);
	}

	private static void method() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Person p = new Person();
		
		BeanUtils.setProperty(p, "name", "xcm");
		BeanUtils.setProperty(p, "age", 18);
		BeanUtils.setProperty(p, "gender", "nv");
		
		//System.out.println(p);
		
		System.out.println(BeanUtils.getProperty(p, "name"));
		System.out.println(BeanUtils.getProperty(p, "age"));
		System.out.println(BeanUtils.getProperty(p, "gender"));
	}

}
