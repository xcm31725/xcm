package com.itheima;

public class Test1_Game {

	public static void main(String[] args) {
		LOL l = new LOL();
		l.show();
		l.start();
		
		System.out.println("--------------");
		DotA d = new DotA();
		d.show();
		d.start();

	}

}

class Game{
	String name;
	String banBen;
	String yunYing;
	
	public void start(){
		System.out.println("��Ϸ��ʼ��");
	}
	
	public void end(){
		System.out.println("��Ϸ������");
	}
}

class LOL extends Game{
	public void show(){
		System.out.println("����LOL��Ϸ");
	}
}

class DotA extends Game{
	public void show(){
		System.out.println("����DotA��Ϸ");
	}
}