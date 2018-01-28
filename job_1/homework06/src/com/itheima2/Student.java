package com.itheima2;

public class Student {
	private String name;
	private int age;
	public Student() {
		super();
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj){
			return true;
		}
		
		if(this.getClass() != obj.getClass()){
			return false;
		}
		
		Student s = (Student)obj;
		
		if(!this.name.equals(s.name)){
			return false;
		}
		
		if(this.age != s.age){
			return false;
		}
		
		return true;
	}
	
}













