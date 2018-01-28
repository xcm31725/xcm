package com.thread2;

public class ThreadTest1 {

	public static void main(String[] args) {
		//method();
		MPTesk1 tesk = MPTesk1.lanHan();
		
		Thread t = new Thread(tesk);
		t.setName("窗口1");
		t.start();
		
		Thread t2 = new Thread(tesk);
		t2.setName("窗口2");
		t2.start();
		
		Thread t3 = new Thread(tesk);
		t3.setName("窗口3");
		t3.start();
	}

	private static void method() {
		MPTesk tesk = MPTesk.eHan();
		
		Thread t = new Thread(tesk);
		t.setName("窗口1");
		t.start();
		
		Thread t2 = new Thread(tesk);
		t2.setName("窗口2");
		t2.start();
		
		Thread t3 = new Thread(tesk);
		t3.setName("窗口3");
		t3.start();
	}
	
	
}
