package com.itheima_03;

public class Coder {
	private String name;
	private String id;
	private String salary;
	
	public Coder() {
	}
	
	public Coder(String name, String id, String salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getSalary() {
		return salary;
	}
	
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public void work(){
		System.out.println("����Ϊ"+id+"��������Ϊ"+salary+"�ĳ���Ա"+name+"����Ŭ����д�Ŵ���......������������");
	}
}
