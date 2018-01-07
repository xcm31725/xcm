package com.itheima_01;

public class Teacher {
	private String jiaoShiBianHao;
	private String name;
	private char xingBei;
	private int age;
	private String keMu;
	
	public Teacher() {
	}
	
	public Teacher(String jiaoShiBianHao, String name, char xingBei, int age, String keMu) {
		this.jiaoShiBianHao = jiaoShiBianHao;
		this.name = name;
		this.xingBei = xingBei;
		this.age = age;
		this.keMu = keMu;
	}
	
	public String getJiaoShiBianHao() {
		return jiaoShiBianHao;
	}
	
	public void setJiaoShiBianHao(String jiaoShiBianHao) {
		this.jiaoShiBianHao = jiaoShiBianHao;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public char getXingBei() {
		return xingBei;
	}
	
	public void setXingBei(char xingBei) {
		this.xingBei = xingBei;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getKeMu() {
		return keMu;
	}
	
	public void setKeMu(String keMu) {
		this.keMu = keMu;
	}

}
