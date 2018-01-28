package com.itheima;
/*
 * 已知接口Play中有一个方法playGame()，再测试类中如何调用该方法？(用匿名内部类实现)
 * */
public class PlayTest {

	public static void main(String[] args) {
		show(
			new Play() {

				@Override
				public void playGame() {
					System.out.println("打游戏");
				}
			}
		);
	}
	
	public static void show(Play p) {
		p.playGame();
	}

}
