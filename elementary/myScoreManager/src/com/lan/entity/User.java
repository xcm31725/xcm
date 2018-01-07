package com.lan.entity;

import java.io.Serializable;

/**
 * 用户
 */
public class User implements Serializable{
	private int id;
	private String name;
	private String phone;
	private String password;
	
	// ALT+SHIFT+S
	public User() {
		super();
	}

	public User(int id, String name, String phone, String password) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.password = password;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", phone=" + phone
				+ ", password=" + password + "]";
	}

}
