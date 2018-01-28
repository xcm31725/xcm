package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * itheima：基础班，就业班
 * 		基础班：01 xcm;02 xgd
 * 		就业班：01 zc; 02 sd
 * 
 * 学校Map
 * 		基础班	基础班学生List
 * 		就业班	就业班学生List
 * Map嵌套Collection
 * */
public class MapTest1 {

	public static void main(String[] args) {
		Map<String,List<Student>> itheima = new HashMap<String,List<Student>>();
		
		//基础班学生List
		List<Student> base = new ArrayList<Student>();
		base.add(new Student("01","xcm"));
		base.add(new Student("02","xgd"));
		
		//就业班学生List
		List<Student> job = new ArrayList<Student>();
		job.add(new Student("01","zc"));
		job.add(new Student("02","sd"));
		
		itheima.put("基础班", base);
		itheima.put("就业班", job);
		
		//遍历学校Map，查看有多少班级和对应的学生
		//获取所有Entry对象
		Set<Map.Entry<String,List<Student>>> entrys = itheima.entrySet();
		for (Map.Entry<String, List<Student>> entry : entrys) {
			//获取班级
			String key = entry.getKey();
			System.out.println("班级信息："+key);
			//获取包含了学生对象List
			List<Student> value = entry.getValue();
			for (Student student : value) {
				System.out.println(student);
			}
		}
	}

}
