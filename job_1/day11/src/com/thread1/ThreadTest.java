package com.thread1;

public class ThreadTest {

	public static void main(String[] args) {
		//�����������
		SticketThread st = new SticketThread();
		//�����̶߳���
		Thread t = new Thread(st);
		t.setName("����1");
		
		Thread t2 = new Thread(st);
		t2.setName("����2");

		Thread t3 = new Thread(st);
		t3.setName("����3");
		
		t.start();
		t2.start();
		t3.start();

	}

}
