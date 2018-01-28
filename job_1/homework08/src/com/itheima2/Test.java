package com.itheima2;

/*
 * 2、分析以下需求，并用代码实现：
		(1)自定义异常IllegalNameException异常
		(2)定义一个学生类,成员变量(String name, int age),给name赋值时如果给定的值是"风清扬"则抛出
			IllegalNameException异常,并给出提示信息:非法的姓名
		(3)在测试类中创建Student对象,并给成员变量赋值
 * */
public class Test {

	public static void main(String[] args) {
		
		try {
			Student s = new Student("风清扬", 18);
			if(s.getName().equals("风清扬")){
				throw new IllegalNameException("非法的姓名");
			}
			
			System.out.println("输入成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/*public static void checkScore(Student ) throws IllegalNameException{
		Student s = new Student();
		if(s.getName().equals("风清扬")){
			throw new IllegalNameException("成绩不合法");
		}
		
		System.out.println("输入成功");
	}*/

}

class Student1 {
	String name;
	int age;
	
	public Student1() {
		super();
	}

	public Student1(String name, int age) {
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
	
	
}