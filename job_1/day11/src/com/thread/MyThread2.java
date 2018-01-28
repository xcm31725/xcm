package com.thread;

public class MyThread2 implements Runnable{
	int num;
	public MyThread2(int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i + "-" + num);
		}
		
	}

}
