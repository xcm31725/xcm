package com.itheima03;

import java.util.ArrayList;

/*
 * 3.	按需求完成指定功能，题目如下（12分）
	定义"军人"类,Soldier,包含以下成员:
	成员属性: name (姓名) :String类型，age (年龄):int类型,，like (爱好):String类型，属性使用private修饰。
	成员方法:
		get/set方法
		show()方法,打印对象所有属性的值;
	定义类：Test,类中定义main()方法，按以下要求编写代码:
	分别实例化三个Soldier对象，三个对象分别为："王小兵" ,25,”打篮球”、 "李团长" ,35,”游泳”、"王军长" ,55,”踢足球”;
	创建一个ArrayList集合，这个集合里面存储的是Solider类型，分别将上面的三个Solider对象添加到集合中.
	遍历这个集合，在遍历的过程中，如果这个集合里面中有对象的年龄大于40，那么将集合中这个对象的爱好改成”打高尔夫”，
	然后调用这个对象的show方法展示这个对象所有的属性信息.

 * */
public class Test3 {
	public static void main(String[] args) {
		ArrayList<Soldier> array = new ArrayList<Soldier>();
		
		array.add(new Soldier("王小兵",25,"打篮球"));
		array.add(new Soldier("李团长",35,"游泳"));
		array.add(new Soldier("王军长",55,"踢足球"));
		
		for (int i = 0; i < array.size(); i++) {
			Soldier s = array.get(i);
			
			if(s.getAge()>40){
				s.setLike("打高尔夫");;
			}
			s.show();
		}
		
		
		
	}
}
