package com.itheima_04;

public class Programmer extends Employee {
	
	public Programmer() {
		super();
	}

	public Programmer(String name, String id, int pay) {
		super(name, id, pay);
	}

	@Override
	public void work() {
		System.out.println(getName()+"´úÂë°á×©");

	}

}
