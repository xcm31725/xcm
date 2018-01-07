package com.itheima01;

public class StudentDemo01 {

	public static void main(String[] args) {
		Student s = new Student("张三",23);
		s.show();
		System.out.println("------------------");
		//setXxx()获取属性值，可以打印，也可以赋值给其他的变量，做其他的操作
		Student s1 = new Student();
		s1.setName("李四");
		s1.setAge(24);
		System.out.println("我的名字是："+s1.getName()+" ,我的年龄是："+s1.getAge());
		//s1.show();
	}

}
/*
 * A:案例演示
 	*学生类
 		*成员变量
 			*name, age
		*构造方法
			*无参，带两个参
		*成员方法
			*getXxx()/setXxx()
			*show();输出该类的所有成员变量值	 
 * B:给成员变量赋值：
 	*a:setXxx()方法
 	*b:构造方法
 * C:输出成员变量值的方式:
 	*a:通过getXxx()分别获取然后拼凑
 	*b: 通过调用show()方法搞定
 */

class Student{
	private String name;
	private int age;
	
	public Student(){
		
	}
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	
	public void show(){
		System.out.println("我的名字是："+name+" ，我的年龄是："+age);
	}
}