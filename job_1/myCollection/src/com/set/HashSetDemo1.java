package com.set;

import java.util.HashSet;

/*
 * 使用HashSet储存自定义对象并遍历
 * 
 * 通过查看源码发现：
 * 		HashSet的add()方法，首先会只用当前集合中的每一个元素和新添加的元素进行hash值比较
 * 		如果hash值不一样，则直接添加新元素
 * 		如果hash值一样，比较地址值或者使用equals方法进行比较
 * 		比较结果一样，则认为是重复不添加
 * 		所有的比较结果都不一样则添加
 * */
public class HashSetDemo1 {

	public static void main(String[] args) {
		//创建集合对象
		HashSet<Student> hs = new HashSet<Student>();
		//创建元素对象
		Student s = new Student("xcm", 18);
		Student s1 = new Student("xgd", 22);
		Student s2 = new Student("xcm", 18);
		
		//添加元素
		hs.add(s);
		hs.add(s1);
		hs.add(s2);
		
		//使用增强for循环遍历集合
		for (Student student : hs) {
			System.out.println(student);
		}
	}

}

class Student {
	String name;
	int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	/*@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		Student s = (Student)obj;
		
		if(this.age != s.age){
			return false;
		}
		
		if(!this.name.equals(s.name)){
			return false;
		}
		
		return true;
	}*/
	
	
}
