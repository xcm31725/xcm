package com.itheima2;

import java.text.SimpleDateFormat;
import java.util.Date;

//(1)定义一个学生类,属性包含:姓名,年龄,出生日期(Date类型),出生地
public class Student {
	private String name;
	private int age;
	private Date brithday;
	private String address;
	public Student() {
		super();
	}
	public Student(String name, int age, Date brithday, String address) {
		super();
		this.name = name;
		this.age = age;
		this.brithday = brithday;
		this.address = address;
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
	public Date getBrithday() {
		return brithday;
	}
	public void setBrithday(Date brithday) {
		this.brithday = brithday;
	}
	public int getAddress() {
		return age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Object date(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		Date d = new Date();
		String date = sdf.format(d);
		return date;
	}
	
	
	
}
