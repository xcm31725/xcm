package com.itheima;
/*
 * String toString() �����ظö�����ַ�����ʾ
 * 		return getClass().getName() + "@" + Integer.toHexString(hashCode());
 * getClass()������һ���ֽ������
 * Integer.toHexString������ָ��������ʮ�������ַ�����ʽ
 * hashCode()�����ظö���Ĺ�ϣ��ֵ���ڲ���ַ��
 * 
 * Boolean equals(Object obj)
 * */
public class ObjectDemo {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "xcm";
		s.age = 18;
		System.out.println(s.toString());//com.itheima.Student@3ef810
		System.out.println(s);//˵���������һ���������Ĭ�������������toString()����

	}

}

class Student {
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
