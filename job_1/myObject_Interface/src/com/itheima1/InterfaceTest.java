package com.itheima1;

public class InterfaceTest {

	public static void main(String[] args) {
		BasketballCoach bc = new BasketballCoach();
		bc.setName("С��è");
		bc.setAge(18);
		bc.setGender("Ů");
		bc.eat();
		bc.sleep();
		bc.speak();
		System.out.println("----------");
		PingPongPlayer ppp = new PingPongPlayer();
		ppp.setName("С����");
		ppp.setAge(22);
		ppp.setGender("��");
		ppp.eat();
		ppp.sleep();
	}

}
