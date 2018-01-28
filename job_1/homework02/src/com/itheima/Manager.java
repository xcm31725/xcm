package com.itheima;

public class Manager extends Person{
	private int bonus;
	
	public Manager() {
		super();
	}

	public Manager(String name, String id, double pay, int bonus) {
		super(name, id, pay);
	}

	@Override
	public void work() {
		System.out.println(getName()+"¼à¶½³ÌĞòÔ±Ğ´´úÂë...");
	}
	
}
