package com.itheima01;
/*
 * 
			��֪ѧ����(Student)����ʦ(Teacher)�����£�
				����:����,����
				��Ϊ:�Է�
				��ʦ�����еķ���:����
				ѧ�������еķ���:ѧϰ
				
			��(Person)
				��Ա����
					����,����
				���췽��
					�޲κ��в�
				��Ա����
					�Է�
					
			ѧ����
				��Ա����
					����,����
				���췽��
					�޲κ��в�
				��Ա����
					�Է�
					ѧϰ
			
			��ʦ
				��Ա����
					����,����
				���췽��
					�޲κ��в�
				��Ա����
					�Է�
					����
 * */
public class TestPerson {

	public static void main(String[] args) {
		Student s = new Student("С����",23);
		s.eat();
		s.study();
		
		Teacher t = new Teacher("С��è",18);
		t.eat();
		t.teach();
	}

}
