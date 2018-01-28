package com.itheima;

public abstract class Person {
	//����
	private String name;
	//����
	private String id;
	//����
	private double pay;
	public Person() {
		super();
	}
	public Person(String name, String id, double pay) {
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
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	
	public abstract void work();
}
