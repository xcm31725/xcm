package com.itheima_02;

public class Student {
	private String xueYuaBianHao;
	private String name;
	private String xingBei;
	private double hight;
	private int age;
	
	public Student() {
	}
	
	public Student(String xueYuaBianHao, String name, String xingBei, double hight, int age) {
		this.xueYuaBianHao = xueYuaBianHao;
		this.name = name;
		this.xingBei = xingBei;
		this.hight = hight;
		this.age = age;
	}
	
	public String getXueYuaBianHao() {
		return xueYuaBianHao;
	}
	
	public void setXueYuaBianHao(String xueYuaBianHao) {
		this.xueYuaBianHao = xueYuaBianHao;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getXingBei() {
		return xingBei;
	}
	
	public void setXingBei(String xingBei) {
		this.xingBei = xingBei;
	}
	
	public double getHight() {
		return hight;
	}
	
	public void setHight(double hight) {
		this.hight = hight;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

}
