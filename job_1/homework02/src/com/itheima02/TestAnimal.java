package com.itheima02;
/*
 * 已知猫类(Cat)和狗(Dog)类：
				属性:毛的颜色,腿的个数
				行为:吃饭
				猫特有行为:抓老鼠catchMouse
				狗特有行为:看家lookHome
 * */
public class TestAnimal {

	public static void main(String[] args) {
		Cat c = new Cat("花猫",4);
		c.eat();
		c.catchMouse();
		
		Dog d = new Dog("黑狗",2);
		d.eat();
		d.lookHome();
	}

}
