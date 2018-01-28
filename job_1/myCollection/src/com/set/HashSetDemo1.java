package com.set;

import java.util.HashSet;

/*
 * ʹ��HashSet�����Զ�����󲢱���
 * 
 * ͨ���鿴Դ�뷢�֣�
 * 		HashSet��add()���������Ȼ�ֻ�õ�ǰ�����е�ÿһ��Ԫ�غ�����ӵ�Ԫ�ؽ���hashֵ�Ƚ�
 * 		���hashֵ��һ������ֱ�������Ԫ��
 * 		���hashֵһ�����Ƚϵ�ֵַ����ʹ��equals�������бȽ�
 * 		�ȽϽ��һ��������Ϊ���ظ������
 * 		���еıȽϽ������һ�������
 * */
public class HashSetDemo1 {

	public static void main(String[] args) {
		//�������϶���
		HashSet<Student> hs = new HashSet<Student>();
		//����Ԫ�ض���
		Student s = new Student("xcm", 18);
		Student s1 = new Student("xgd", 22);
		Student s2 = new Student("xcm", 18);
		
		//���Ԫ��
		hs.add(s);
		hs.add(s1);
		hs.add(s2);
		
		//ʹ����ǿforѭ����������
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
