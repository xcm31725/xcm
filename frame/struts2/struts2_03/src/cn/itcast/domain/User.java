package cn.itcast.domain;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class User {
	private int id;
	private int age;
	private String name;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date birthday;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
