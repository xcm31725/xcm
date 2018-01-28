package com.itheima01;

public class InterfaceTest {

	public static void main(String[] args) {
		BasketballPlayer bp = new BasketballPlayer();
		bp.setName("小馋猫");
		bp.setAge(18);
		bp.setGander("女");
		bp.eat();
		bp.sleep();
		bp.sutdy();
		bp.speckEnglish();
		
		System.out.println("-------------");
		
		PingPongCoach ppc = new PingPongCoach("小果冻",22,"男");
		ppc.eat();
		ppc.sleep();
		ppc.teach();

	}

}
