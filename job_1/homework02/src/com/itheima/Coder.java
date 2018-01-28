package com.itheima;

public class Coder extends Person{
	
	public Coder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coder(String name, String id, double pay) {
		super(name, id, pay);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		System.out.println(getName()+"ÕıÔÚĞ´´úÂë...");
	}
	
}
