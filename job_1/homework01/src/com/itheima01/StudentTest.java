package com.itheima01;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 4,�����¼��5��ѧ��(������String����,������int����,�ɼ���double����)�ɼ���ƽ��ֵ
		����¼��5��ѧ����Ϣ,��ʽΪ:����,����,�ɼ�
			��:����,19,99
		��ʾ:
			Integer������һ������parseInt(String s)���ַ���ת��Ϊintֵ
			��Ҫ������¼������ݷ�װ��������
			������ѡȡ:
				5��ѧ����Ҫѡ��һ������		
 * */
public class StudentTest {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++){
			System.out.println("�������"+(i+1)+"��ѧ����������");
			String name = sc.next();
			
			System.out.println("�������"+(i+1)+"��ѧ�������䣺");
			int age = sc.nextInt();
			
			System.out.println("�������"+(i+1)+"��ѧ���ĳɼ���");
			double score = sc.nextDouble();
			
			Student s = new Student();
			s.setName(name);
			s.setAge(age);
			s.setScore(score);
			
			list.add(s);
			System.out.println("��"+(i+1)+"�����");
		}
		
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			sum += s.getScore();
		}
		
		double avg = (sum+0.0)/list.size();
		System.out.println("ѧ���ɼ���ƽ��ֵ:"+avg);
	}

}
