package com.itheima2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/*
 * 3�������������󣬲��ô���ʵ�֣�
		(1)����һ��ѧ����,���԰���:����,����,��������(Date����),������
		(2)�������϶���,���洢3��ѧ������
		(3)�������е�����ѧ������洢����Ŀ��·��a.txt�ļ���
			�洢�ĸ�ʽ��:����,����,��������,������
 * */
public class Test {

	public static void main(String[] args) throws IOException, ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
		ArrayList<Student> list = new ArrayList<Student>();
		/*Student s = new Student("�Ի�",22,null,"����");
		Student s1 = new Student("����",18,null,"μ��");
		Student s2 = new Student("С��",19,null,"����");
		
		list.add(s);
		list.add(s1);
		list.add(s2);*/
		list.add(new Student("�Ի�",22,sdf.parse("1995��3��24��"),"����"));
		list.add(new Student("����",18,sdf.parse("2000��3��17��"),"μ��"));
		list.add(new Student("С��",19,sdf.parse("1999��3��24��"),"����"));
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
		
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			bw.write(s.getName()+","+s.getAge()+","+sdf.format(s.getBrithday())+","+s.getAddress());
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}

}
