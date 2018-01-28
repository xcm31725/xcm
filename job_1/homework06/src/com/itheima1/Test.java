package com.itheima1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 * 1、分析以下需求，并用代码实现：
		(1)定义List集合，使用键盘录入存入多个字符串,当输入"quit"字符串时结束输入
		(2)删除集合中字符串"def"
		(3)然后利用迭代器遍历集合元素并输出
 * */
public class Test {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("请输入字符串：");
			String s = sc.next();
			
			if(s.equals("quit")){
				break;
			}
			
			list.add(s);
			list.remove("def");
		}
		
		
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
