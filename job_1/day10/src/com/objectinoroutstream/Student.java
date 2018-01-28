package com.objectinoroutstream;

import java.io.Serializable;
import java.util.SimpleTimeZone;

public class Student implements Serializable{
	String name;
	int age;
	
	public Student (String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
}
