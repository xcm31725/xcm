package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * itheima�������࣬��ҵ��
 * 		�����ࣺ01 xcm;02 xgd
 * 		��ҵ�ࣺ01 zc; 02 sd
 * 
 * ѧУMap
 * 		������	������ѧ��List
 * 		��ҵ��	��ҵ��ѧ��List
 * MapǶ��Collection
 * */
public class MapTest1 {

	public static void main(String[] args) {
		Map<String,List<Student>> itheima = new HashMap<String,List<Student>>();
		
		//������ѧ��List
		List<Student> base = new ArrayList<Student>();
		base.add(new Student("01","xcm"));
		base.add(new Student("02","xgd"));
		
		//��ҵ��ѧ��List
		List<Student> job = new ArrayList<Student>();
		job.add(new Student("01","zc"));
		job.add(new Student("02","sd"));
		
		itheima.put("������", base);
		itheima.put("��ҵ��", job);
		
		//����ѧУMap���鿴�ж��ٰ༶�Ͷ�Ӧ��ѧ��
		//��ȡ����Entry����
		Set<Map.Entry<String,List<Student>>> entrys = itheima.entrySet();
		for (Map.Entry<String, List<Student>> entry : entrys) {
			//��ȡ�༶
			String key = entry.getKey();
			System.out.println("�༶��Ϣ��"+key);
			//��ȡ������ѧ������List
			List<Student> value = entry.getValue();
			for (Student student : value) {
				System.out.println(student);
			}
		}
	}

}
