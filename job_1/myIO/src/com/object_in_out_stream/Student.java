package com.object_in_out_stream;

import java.io.Serializable;

public class Student implements Serializable{
	/**  
	 * @Fields serialVersionUID : TODO(��һ�仰�������������ʾʲô)  
	 */ 
	private static final long serialVersionUID = 2158919771016627422L;
	String name;
	int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
