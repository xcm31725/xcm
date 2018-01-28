package com.collection;

import java.util.ArrayList;

/*
 * ArrayList
 * 集合的体系结构
 * 		由于不同的数据结构（数组的组织，存储方式），所以Java为我们提供了不同集合
 * 		但是不同的集合他们的功能都是相似，不断的向上提取，将共性抽取出来这就是集合体系结构形成的原因
 * 
 * 体系结构：
 * 		怎么学习？最顶层开始学习，因为最顶层包含了所有的共性
 * 		怎么使用？使用最底层，因为最底层就是具体的实现
 * 
 * Collection
 * List
 * ArrayList
 * */
public class CollecteonDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		/*for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}*/
		System.out.println(list);
	}

}
