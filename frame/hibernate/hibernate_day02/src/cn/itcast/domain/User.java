package cn.itcast.domain;

import java.util.HashSet;
import java.util.Set;

public class User {
	private Integer id;
	private String name;
	private Set<Order> set = new HashSet<Order>();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Order> getSet() {
		return set;
	}
	public void setSet(Set<Order> set) {
		this.set = set;
	}
}	
