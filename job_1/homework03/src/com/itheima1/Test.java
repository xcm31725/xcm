package com.itheima1;
/*
 * 			具体的事物:猫,狗
			共性:姓名,颜色,吃饭
			特性:
				猫吃鱼
				狗吃肉
			部分猫和狗具有跳高的功能
 * */
public class Test {

	public static void main(String[] args) {
		Cat c = new Cat("花猫","花色");
		c.eat();
		Dog d = new Dog("小黑","黑色");
		d.eat();

	}
	
	

}
