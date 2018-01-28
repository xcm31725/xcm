package com.itheima;

import java.util.ArrayList;

/*
 * boolean equals(Object obj) 
 * 		使用==来比较两个对象是否相等，比较地址值是否相等
 * */
public class ObjectDemo1 {

	public static void main(String[] args) {
		Person p = new Person("小馋猫", 18);
		Person p2 = new Person("小馋猫", 18);
		
		//boolean flag = p.equals(p2);
		boolean flag = p.equals(new ArrayList());
		
		System.out.println(flag);
	}

}

class Person {
	String name;
	int age;
	
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}

	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}*/
	
	
	
	public boolean equals(Object o){
		//提高效率 党前对象和传递进来的对象地址值一样，则不用比较成员
		if(this == o){
			return true;
		}
		
		//提高代码的健壮性
		if(this.getClass() != o.getClass()){
			return false;
		}
		
		//向下转型
		Person p = (Person)o;
		if(!this.name.equals(p.name)){
			return false;
		}
		
		if(this.age != p.age){
			return false;
		}
		return true;
		
	}
}