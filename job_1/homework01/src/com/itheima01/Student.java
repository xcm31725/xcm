package com.itheima01;

public class Student {
	//����
	private String name;
	//����
	private int age;
	//�ɼ�
	private double score;
	public Student() {
	}
	public Student(String name, int age, double score) {
		this.name = name;
		this.age = age;
		this.score = score;
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
	public void setAge(int arr) {
		this.age = arr;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double arr) {
		this.score = arr;
	}
	
}
