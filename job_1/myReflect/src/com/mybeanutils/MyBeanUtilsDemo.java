package com.mybeanutils;

import java.util.HashMap;
import java.util.Map;

import com.beanutils.Person;

public class MyBeanUtilsDemo {

	public static void main(String[] args) throws ReflectiveOperationException {
		//method();
		Person p = new Person();
		Map map = new HashMap();
		map.put("name", "zzc");
		map.put("age", 18);
		map.put("gender", "女");
		map.put("brithday", "2018年1月26日");
		
		MyBeanUtils.populate(p, map);
		//System.out.println();
		System.out.println(p);
	}

	private static void method() throws ReflectiveOperationException {
		Person p = new Person();
		
		MyBeanUtils.setProperty(p, "name", "xcm");
		MyBeanUtils.setProperty(p, "age", 18);
		MyBeanUtils.setProperty(p, "gender", "女");
		
		//System.out.println(p);
		String name = MyBeanUtils.getProperty(p, "name");
		String age = MyBeanUtils.getProperty(p, "age");
		String gender = MyBeanUtils.getProperty(p, "gender");
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
	}

}
