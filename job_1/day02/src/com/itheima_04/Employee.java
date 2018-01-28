package com.itheima_04;

public abstract class Employee {
	//����(name)
	private String name;
	//����(id)
	private String id;
	//нˮ(pay)
	private int pay;
	
	public Employee() {
		super();
	}
	public Employee(String name, String id, int pay) {
		super();
		this.name = name;
		this.id = id;
		this.pay = pay;
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
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	public abstract void work();
}
