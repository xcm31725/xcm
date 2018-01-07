package com.itheima01;
/*
 *2.请设计一个猫的标准类，里面名字和年龄等属性，吃饭和睡觉等行为，设计完成后通过主方法进行测试
 * */
public class CarTest {

	public static void main(String[] args) {
		Car c = new Car();
		c.setName("����è");
		c.setAge(18);
		c.eat();
		c.sleep();
		
		Car c1 = new Car("��è",22);
		
		c1.eat();
		c1.sleep();
	}

}
