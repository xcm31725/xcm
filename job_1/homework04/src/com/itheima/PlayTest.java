package com.itheima;
/*
 * ��֪�ӿ�Play����һ������playGame()���ٲ���������ε��ø÷�����(�������ڲ���ʵ��)
 * */
public class PlayTest {

	public static void main(String[] args) {
		show(
			new Play() {

				@Override
				public void playGame() {
					System.out.println("����Ϸ");
				}
			}
		);
	}
	
	public static void show(Play p) {
		p.playGame();
	}

}
