package com.ithiema5;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 5��Map������key�洢���ǰ༶����String,
		value�洢�������е�ѧ��HashMap(HashMap������key�洢����ѧ��String,value�洢����Student)
		���Բ�����
 * */
public class Test {

	public static void main(String[] args) {
		Map<String,HashMap<String,Student>> map = new HashMap<String,HashMap<String,Student>>();
		
		HashMap<String,Student> base = new HashMap<String,Student>();
		
		base.put("001", new Student("xcm","18"));
		base.put("002", new Student("xgd","22"));
		
		HashMap<String,Student> job = new HashMap<String,Student>();
		
		job.put("001", new Student("zc","17"));
		job.put("002", new Student("sd","23"));
		
		map.put("������", base);
		map.put("��ҵ��", job);
		
		Set<Map.Entry<String, HashMap<String, Student>>> entrys = map.entrySet();
		for (Map.Entry<String, HashMap<String, Student>> entry : entrys) {
			String key = entry.getKey();
			System.out.println("key:"+key);
			
			HashMap<String, Student> stu = entry.getValue();
			Set<Map.Entry<String, Student>> entrys1 = stu.entrySet();
			for (Entry<String, Student> entry2 : entrys1) {
				String key2 = entry2.getKey();
				Student value = entry2.getValue();
				System.out.println("id:"+key2+"\t"+"value:"+value);
			}
			
			/*for (Map.Entry<String, HashMap<String, Student>> num : stu) {
				//Student value = stu.get(num);
				//System.out.println("num:"+num+"\t"+"value:"+value);
				//System.out.println(num);
			}*/
		}
 	}

}
