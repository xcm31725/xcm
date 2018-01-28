package com.itheima4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 4�������������󣬲��ô���ʵ�֣�
		(1)����һ��ѧ����Student�����ԣ�����(String name)���༶���(String no)���ɼ�(double score)
		(2)������Student�������List���ϣ���ͳ�Ʋ���ӡ���������ŵ�ѧ������Ϣ,��ʽ����:
			"�༶����"--"����"--"�༶���"--"�ɼ�"
			˼·��
				a.������������˼��
				b.���Ƽ�ʹ��Map<String,List<Student>> ����������
				c.�Ƽ�ʹ��Map<String��ClassRoom>
 * */
public class Test {

	public static void main(String[] args) {
		/*List<Student> list = new ArrayList<Student>();
		list.add(new Student("xcm","1501",100));
		list.add(new Student("xgd","1502",67));
		list.add(new Student("czm","1503",88));*/
		
		Map<String,Student> map = new HashMap<String,Student>();
		
		map.put("��ҵ��", new Student("xcm","1501",100));
		map.put("������", new Student("xgd","1502",67));
		
		Set<Entry<String, Student>> entrys = map.entrySet();
		for (Entry<String, Student> entry : entrys) {
			String key = entry.getKey();
			Student value = entry.getValue();
			
			System.out.println(key+value);
		}
		
		
	}

}
