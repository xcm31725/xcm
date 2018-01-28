package com.thread1;

public class ThreadTest {

	public static void main(String[] args) {
		//创建任务对象
		SticketThread st = new SticketThread();
		//创建线程对象
		Thread t = new Thread(st);
		t.setName("窗口1");
		
		Thread t2 = new Thread(st);
		t2.setName("窗口2");

		Thread t3 = new Thread(st);
		t3.setName("窗口3");
		
		t.start();
		t2.start();
		t3.start();

	}

}
