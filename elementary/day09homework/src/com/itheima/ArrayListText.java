package com.itheima;

import java.util.ArrayList;

public class ArrayListText {

	public static void main(String[] args) {
		//创建集合对象
		ArrayList<String> array = new ArrayList<String>();
		
		//2.向集合内添加以下数据：
		array.add("孙悟空");
		array.add("猪八戒");
		array.add("沙和尚");
		array.add("铁扇公主");
		
		//3.不用遍历，直接打印集合
		System.out.println(array);
		
		//4.获取第4个元素（注意，是--第4个元素，它的索引是？）
		array.get(3);
		
		//5.打印一下集合大小
		System.out.println("len:"+array.size());
		
		//6.删除元素“铁扇公主”
		array.remove("铁扇公主");
		
		//7.删除第3个元素（注意：是--第3个元素）
		array.remove(2);
		
		//8.将元素“猪八戒”改为“猪悟能”
		array.set(1, "猪无能");
		
		//9.再次打印集合
		System.out.println(array);
		
	}

}
