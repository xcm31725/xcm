package com.itheima03;

public class Students {
	private String name;
	
	private int age;
	
	private int score;

	public Students() {
	}

	public Students(String name, int age, int score) {
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

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public void eat(){
		System.out.println("³Ô·¹µÄ¹¦ÄÜ");
	}
	
	public void study(String content){
		
	}
}
