package com.mybeanutils;

import java.util.HashMap;
import java.util.Map;

import com.beanutils.Person;

public class MyBeanUtilsDemo {

	public static void main(String[] args) throws ReflectiveOperationException {
		Person p = new Person();
		/*
		MyBeanUtils.setProperty(p, "name", "zcm");
		
		//System.out.println(p);
		String name = MyBeanUtils.getProperty(p, "name");
		System.out.println(name);*/
		
		Map map = new HashMap();
		
		map.put("name", "xcm");
		map.put("age", 18);
		map.put("gender", "nv");
		map.put("birthday", "2018Äê1ÔÂ26ÈÕ");
		
		MyBeanUtils.populate(p, map);
		System.out.println(p);
	}
}
