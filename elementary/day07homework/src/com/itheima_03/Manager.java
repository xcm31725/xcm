package com.itheima_03;

public class Manager {
	private String name;
	private String id;
	private String salary; 
	private String bonus;
	
	public Manager() {
	}
	
	public Manager(String name, String id, String salary, String bonus) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.bonus = bonus;
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
	
	public String getBonus() {
		return bonus;
	}
	
	public void setBonus(String bonus) {
		this.bonus = bonus;
	}
	
	public void work(){
		System.out.println("����Ϊ"+id+"��������Ϊ"+salary+"����Ϊ"+bonus+"����Ŀ����"+name+"����Ŭ�������Ź�����,��������,���Ա���ύ�����Ĵ���...");
	}
}
