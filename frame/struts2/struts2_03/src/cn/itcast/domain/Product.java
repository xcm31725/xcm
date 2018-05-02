package cn.itcast.domain;

import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonFilter;

//@JsonIgnoreProperties({"id","birthday"})
@JsonFilter("pf")
public class Product {

	private int id;
	private String name;
	private double price;
//	@JsonIgnore //过滤属性
	private Date birthday;
	
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	
}
