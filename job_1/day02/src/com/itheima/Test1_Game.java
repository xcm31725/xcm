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
		System.out.println("游戏开始了");
	}
	
	public void end(){
		System.out.println("游戏结束了");
	}
}

class LOL extends Game{
	public void show(){
		System.out.println("这是LOL游戏");
	}
}

class DotA extends Game{
	public void show(){
		System.out.println("这是DotA游戏");
	}
}