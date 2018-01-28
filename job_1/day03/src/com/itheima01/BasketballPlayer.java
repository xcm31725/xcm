package com.itheima01;

public class BasketballPlayer extends Player implements SpeckEnglish {
	
	public BasketballPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BasketballPlayer(String name, int age, String gander) {
		super(name, age, gander);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speckEnglish() {
		System.out.println("Àµ”¢”Ô");

	}

	@Override
	public void sutdy() {
		System.out.println("—ßø€¿∫");

	}

}
