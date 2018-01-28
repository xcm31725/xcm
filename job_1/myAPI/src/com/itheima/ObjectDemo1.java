package com.itheima;

import java.util.ArrayList;

/*
 * boolean equals(Object obj) 
 * 		ʹ��==���Ƚ����������Ƿ���ȣ��Ƚϵ�ֵַ�Ƿ����
 * */
public class ObjectDemo1 {

	public static void main(String[] args) {
		Person p = new Person("С��è", 18);
		Person p2 = new Person("С��è", 18);
		
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
		//���Ч�� ��ǰ����ʹ��ݽ����Ķ����ֵַһ�������ñȽϳ�Ա
		if(this == o){
			return true;
		}
		
		//��ߴ���Ľ�׳��
		if(this.getClass() != o.getClass()){
			return false;
		}
		
		//����ת��
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