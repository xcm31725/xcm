package com.itheima_04;

public class Student {
	private String name;
	private int age;
	private String content;
	
	public Student() {
	}
	
	public Student(String name, int age, String content) {
		this.name = name;
		this.age = age;
		this.content = content;
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
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public void eat(){
		System.out.println("����Ϊ"+age+"��"+name+"ͬѧ���ڳԷ�...");
	}
	
	public void study(){
		System.out.println("����Ϊ"+age+"��"+name+"ͬѧ����ר����־������"+content+"��֪ʶ........");
	}
}
