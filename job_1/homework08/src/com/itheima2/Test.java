package com.itheima2;

/*
 * 2�������������󣬲��ô���ʵ�֣�
		(1)�Զ����쳣IllegalNameException�쳣
		(2)����һ��ѧ����,��Ա����(String name, int age),��name��ֵʱ���������ֵ��"������"���׳�
			IllegalNameException�쳣,��������ʾ��Ϣ:�Ƿ�������
		(3)�ڲ������д���Student����,������Ա������ֵ
 * */
public class Test {

	public static void main(String[] args) {
		
		try {
			Student s = new Student("������", 18);
			if(s.getName().equals("������")){
				throw new IllegalNameException("�Ƿ�������");
			}
			
			System.out.println("����ɹ�");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/*public static void checkScore(Student ) throws IllegalNameException{
		Student s = new Student();
		if(s.getName().equals("������")){
			throw new IllegalNameException("�ɼ����Ϸ�");
		}
		
		System.out.println("����ɹ�");
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