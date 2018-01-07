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
		System.out.println("工号为"+id+"基本工资为"+salary+"的程序员"+name+"正在努力的写着代码......操作步骤描述");
	}
}
