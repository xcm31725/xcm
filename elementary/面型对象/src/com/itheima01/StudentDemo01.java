package com.itheima01;

public class StudentDemo01 {

	public static void main(String[] args) {
		Student s = new Student("����",23);
		s.show();
		System.out.println("------------------");
		//setXxx()��ȡ����ֵ�����Դ�ӡ��Ҳ���Ը�ֵ�������ı������������Ĳ���
		Student s1 = new Student();
		s1.setName("����");
		s1.setAge(24);
		System.out.println("�ҵ������ǣ�"+s1.getName()+" ,�ҵ������ǣ�"+s1.getAge());
		//s1.show();
	}

}
/*
 * A:������ʾ
 	*ѧ����
 		*��Ա����
 			*name, age
		*���췽��
			*�޲Σ���������
		*��Ա����
			*getXxx()/setXxx()
			*show();�����������г�Ա����ֵ	 
 * B:����Ա������ֵ��
 	*a:setXxx()����
 	*b:���췽��
 * C:�����Ա����ֵ�ķ�ʽ:
 	*a:ͨ��getXxx()�ֱ��ȡȻ��ƴ��
 	*b: ͨ������show()�����㶨
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
		System.out.println("�ҵ������ǣ�"+name+" ���ҵ������ǣ�"+age);
	}
}