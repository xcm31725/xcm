package com.itheima01;

public class InterfaceTest {

	public static void main(String[] args) {
		BasketballPlayer bp = new BasketballPlayer();
		bp.setName("С��è");
		bp.setAge(18);
		bp.setGander("Ů");
		bp.eat();
		bp.sleep();
		bp.sutdy();
		bp.speckEnglish();
		
		System.out.println("-------------");
		
		PingPongCoach ppc = new PingPongCoach("С����",22,"��");
		ppc.eat();
		ppc.sleep();
		ppc.teach();

	}

}
