package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * itheima：基础班，就业班
 * 		基础班：01 xcm;02 xgd
 * 		就业班：01 zc; 02 sd
 * 分析：
 * 		我们需要有班级和学生，班级和学生之间是一种对应关系（映射关系）
 * 		由于有对应关系，所以我们可以使用Map集合来存储这样的数据源
 * 		可以使用班级作为key，学生作为value
 * 		Map中key只能对应一个value，但是我们一个班级有多个学生，
 * 		我们可以创建一个包含多个学生的集合，让班级和这个集合产生一一对应的关系
 * 		学生信息分为学号和姓名，这也是一种对应关系，所有我们使用Map集合来储存学生信息
 * 
 * 学校Map
 * 		基础班	基础班学生Map
 * 		就业班	就业班学生Map
 * Map嵌套Map
 * 
 * */
public class MapTest {

	public static void main(String[] args) {
		//创建学校Map
		Map<String,Map<String,String>> itheima = new HashMap<String,Map<String,String>>();
		
		//创建基础班Map
		Map<String,String> base = new HashMap<String,String>();
		base.put("01", "xcm");
		base.put("02", "xgd");
		
		//创建就业班Map
		Map<String,String> job = new HashMap<String,String>();
		job.put("01", "zc");
		job.put("02", "sd");
		
		//把包含了学生的Map添加到学校Map中
		itheima.put("基础班", base);
		itheima.put("就业班", job);
		
		//遍历学校Map，查看有多少个班级和对应的学生
		//先获取所有的班级
		Set<String> keys = itheima.keySet();
		for (String key : keys) {
			//输出班级名称
			System.out.println("班级信息："+key);
			
			//根据班级获取对应的所有学生
			Map<String, String> stu = itheima.get(key);
			
			//获取所有学生的学号
			Set<String> nums = stu.keySet();
			for (String num : nums) {
				//根据学号获取学生的姓名
				String name = stu.get(num);
				System.out.println("学号："+num+"，"+"姓名："+name);
			}
		}
	}

}










