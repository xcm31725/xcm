package com.itheima;

public class ObjectDemo1 {

	public static void main(String[] args) {
		Student1 s = new Student1();
		s.name = "³Ô»õ";
		s.age = 22;
		//System.out.println(s.(toString()));
		System.out.println(s.toString());
		System.out.println(s);
	}

}

class Student1 {
	String name;
	int age;
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	/*public String toString(){
		return name + "@" + age;
	}*/
	
	
}