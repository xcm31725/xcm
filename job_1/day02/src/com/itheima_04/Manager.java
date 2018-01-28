package com.itheima_04;

public class Manager extends Employee {
	//还有奖金(bonus)。
	private int bonus;
	
	public Manager() {
		super();
	}

	public Manager(String name, String id, int pay, int bonus) {
		super(name, id, pay);
	}

	@Override
	public void work() {
		System.out.println(getName()+"给程序员分配工作");
	}
	

}
