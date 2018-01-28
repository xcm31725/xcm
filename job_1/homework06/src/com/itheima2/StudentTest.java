package com.itheima2;

import java.util.ArrayList;
import java.util.List;

/*
 * 2、ArrayList去除集合中自定义对象(Student 属性name和age)的重复值(name和age相同则为同一个人),
		
		提示:
			1,创建新集合用来存储没有重复元素的对象
			2,遍历原集合对象,获取每一个元素,判断新集合中是否包含该元素
						如果不包含,添加到新集合中
			3,新集合中就是去除重复元素的集合
			
		注意:
			在Student中重写Object中的equals方法
 * */
public class StudentTest {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("xcm",18));
		list.add(new Student("xgd",22));
		list.add(new Student("xcm",18));
		list.add(new Student("cam",17));
		
		/*for (Student student : list) {
			System.out.println(student);
		}*/
		
		List<Student> newList = new ArrayList<Student>();
		
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			if(!newList.contains(s)){
				newList.add(s);
			}
		}
		/*int index = -1;
		for (int i = 0; i < list.size(); i++) {
			//Student s = list.get(i);
			//System.out.println(s);
			
			for(int j = 0; j<list.size(); j++){
				//Student s1 = list.get(j);
				if(!list.get(i).equals(list.get(j))){
					index = j;
//					break;
				}
			}
			if(index == -1){
				//
			}else{
				newList.add(list.get(index));
			}
		}
		System.out.println(index);*/
		
		/*Object[] obj = list.toArray();
		for (int i = 0; i < obj.length; i++) {
			Student s = list.get(i);
			//System.out.println(s);
			if(s.equals(s)){
				list.remove(i);
			}
			newList.add(s);
		}*/
		
		for (Student student : newList) {
			System.out.println(student);
		}
	}

		/*for(int j = 0; j<list.size(); ){
			
			Student s = list.remove(j);
			if(list.remove(s)){
				list.add(j,s);
			}else{
				list.add(j,s);
				j++;
			}
			
			newList.add(s);
		}*/
	/*public static void method(List<Student> list){
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			System.out.println(s);
		}
	}*/
}
