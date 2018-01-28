package com.itheima4;
//姓名(String name)、班级班号(String no)、成绩(double score)
public class Student {
	private String name;
	private String no;
	private double score;
	public Student() {
		super();
	}
	public Student(String name, String no, double score) {
		super();
		this.name = name;
		this.no = no;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return " -- " + name + " -- " + no + " -- " + score;
	}
	
	//--"姓名"--"班级班号"--"成绩"
	
}
