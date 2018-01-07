package com.itheima;

public class Demo_01This {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("xcm");
		p1.setAge(17);
		System.out.println(p1.getName()+"..."+p1.getAge());
		
		Person p2 = new Person();
		p2.setName("xgd");
		p2.setAge(22);
		System.out.println(p2.getName()+"..."+p2.getAge());
	}

}
class Person{
	private String name;
	private int age;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		if(age>0 && age<200){
			this.age = age;
		}else{
			System.out.println("Çë»Ø»ğĞÇ°É£¬µØÇòÊÊºÏÄã");
		}
		
	}
	public int getAge(){
		return age;
	}
	
}