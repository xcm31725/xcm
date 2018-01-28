package com.reflect;

/**  
 * @ClassName: Student  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author sudong
 * @date 2018年1月24日 下午7:59:41  
 *    
 */
public class Student {
	private String name;
	int age;
	public Student() {
		super();
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
}
