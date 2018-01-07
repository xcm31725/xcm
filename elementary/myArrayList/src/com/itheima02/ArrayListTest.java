package com.itheima02;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("张三");
		array.add("李四");
		array.add("张三");
		array.add("王五");
		array.add("赵六");
		array.add("田七");
		array.add("张三");
		array.add("赵六");
		array.add("田七");
		array.add("张三");
		
		for(int i=0;i<array.size();){
			
			String name = array.remove(i);
			
			if(array.remove(name)){
				array.add(i,name);
			}else{
				array.add(i, name);
				i++;
			}
		}
		System.out.println(array);
	}

}
