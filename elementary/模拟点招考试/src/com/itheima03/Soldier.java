package com.itheima03;
//name (姓名) :String类型，age (年龄):int类型,，like (爱好):String类型，属性使用private修饰。
public class Soldier {
	private String name;
	private int age;
	private String like;
	public Soldier() {
	}
	public Soldier(String name, int age, String like) {
		this.name = name;
		this.age = age;
		this.like = like;
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
	public String getLike() {
		return like;
	}
	public void setLike(String like) {
		this.like = like;
	}
	
	public void show(){
		System.out.println(name+"\t"+age+"\t"+like);
	}
}
