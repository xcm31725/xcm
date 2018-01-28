package com.itheima01;

public class BasketballCoach extends Coach implements SpeckEnglish {
	
	public BasketballCoach() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BasketballCoach(String name, int age, String gander) {
		super(name, age, gander);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speckEnglish() {
		System.out.println("Àµ”¢”Ô");

	}

	@Override
	public void teach() {
		System.out.println("ΩÃø€¿∫");
	}

}
