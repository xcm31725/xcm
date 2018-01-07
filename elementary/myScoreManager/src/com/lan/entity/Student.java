package com.lan.entity;

import java.io.Serializable;
/**
 * 学生实体类
 */
public class Student implements Serializable{
	private int id;
	private String name;
	private String sex;
	private double math;
	private double english;
	private double chinses;
	
	public Student() {
		super();
	}
	public Student(int id, String name, String sex, double math,
			double english, double chinses) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.math = math;
		this.english = english;
		this.chinses = chinses;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}
	public double getEnglish() {
		return english;
	}
	public void setEnglish(double english) {
		this.english = english;
	}
	public double getChinses() {
		return chinses;
	}
	public void setChinses(double chinses) {
		this.chinses = chinses;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex
				+ ", math=" + math + ", english=" + english + ", chinses="
				+ chinses + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(chinses);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(english);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		temp = Double.doubleToLongBits(math);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Double.doubleToLongBits(chinses) != Double
				.doubleToLongBits(other.chinses))
			return false;
		if (Double.doubleToLongBits(english) != Double
				.doubleToLongBits(other.english))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(math) != Double
				.doubleToLongBits(other.math))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}
	
	
	
	//ALT+SHIFT+S
	
	
	
}
