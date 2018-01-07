package com.itheima05;

import java.util.ArrayList;

/*
 *  1.成员属性: brand (品牌)：String类型, price (价格):int类型，属性使用private修饰。为所有属性提供set/get方法。
       2.     定义测试类，在测试类的main函数中完成：
  2.1 实例化4个Car对象，4个对象的属性分别为："Auto"  25，”Audi”  500，"Benz"  700，”BMW”  400。
  2.2 创建一个ArrayList集合，分别将上面的4个Car对象添加到集合中。
  2.3 获取集合中元素的品牌为“B”开头的所有汽车价格总和，并在控制台打印输出

 * */
public class CarTest {

	public static void main(String[] args) {
		ArrayList<Car> array = new ArrayList<Car>();
		
		array.add(new Car("Auto",25));
		array.add(new Car("Audi",500));
		array.add(new Car("Benz",700));
		array.add(new Car("BMW",400));
		
		int sum = 0;
		for (int i = 0; i < array.size(); i++) {
			Car c = array.get(i);
			
			if(c.getBrand().startsWith("B")){
				sum += c.getPrice();
			}
		}
		System.out.println(sum);
	}

}
