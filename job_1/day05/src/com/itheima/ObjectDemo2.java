package com.itheima;

import java.util.ArrayList;
//Exception in thread "main" java.lang.ClassCastException
public class ObjectDemo2 {

	public static void main(String[] args) {
		Person p = new Person("³Ô»õ",18);
		Person p1 = new Person("³Ô2»õ",18);
		
		//boolean flag = p.equals(p1);
		boolean flag = p.equals(new ArrayList());
		System.out.println(flag);
	}

}

class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
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
	}
*/
	@Override
	//public boolean equals(Object obj) {
	public boolean equals(Object o){
		if(this == o){
			return true;
		}
		
		if(this.getClass() != o.getClass()){
			return false;
		}
		
		Person other = (Person)o;

		if(!(this.name.equals(other.name))){
			return false;
		}
		
		if(this.age != other.age){
			return false;
		}
		return true;
		
	}
}



