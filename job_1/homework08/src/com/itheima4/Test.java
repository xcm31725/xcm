package com.itheima4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 4、分析以下需求，并用代码实现：
		(1)定义一个学生类Student，属性：姓名(String name)、班级班号(String no)、成绩(double score)
		(2)将若干Student对象存入List集合，并统计并打印出所有姓张的学生的信息,格式如下:
			"班级名称"--"姓名"--"班级班号"--"成绩"
			思路：
				a.采用面向对象的思想
				b.不推荐使用Map<String,List<Student>> 操作不方便
				c.推荐使用Map<String，ClassRoom>
 * */
public class Test {

	public static void main(String[] args) {
		/*List<Student> list = new ArrayList<Student>();
		list.add(new Student("xcm","1501",100));
		list.add(new Student("xgd","1502",67));
		list.add(new Student("czm","1503",88));*/
		
		Map<String,Student> map = new HashMap<String,Student>();
		
		map.put("就业班", new Student("xcm","1501",100));
		map.put("基础班", new Student("xgd","1502",67));
		
		Set<Entry<String, Student>> entrys = map.entrySet();
		for (Entry<String, Student> entry : entrys) {
			String key = entry.getKey();
			Student value = entry.getValue();
			
			System.out.println(key+value);
		}
		
		
	}

}
