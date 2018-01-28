package com.itheima1;

public class InterfaceTest {

	public static void main(String[] args) {
		BasketballCoach bc = new BasketballCoach();
		bc.setName("小馋猫");
		bc.setAge(18);
		bc.setGender("女");
		bc.eat();
		bc.sleep();
		bc.speak();
		System.out.println("----------");
		PingPongPlayer ppp = new PingPongPlayer();
		ppp.setName("小果冻");
		ppp.setAge(22);
		ppp.setGender("男");
		ppp.eat();
		ppp.sleep();
	}

}
