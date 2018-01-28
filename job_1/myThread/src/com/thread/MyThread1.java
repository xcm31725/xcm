package com.thread;

public class MyThread1 implements Runnable{
	int num;
	
	public MyThread1(int num) {
		this.num = num;
	}
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			//Thread t = new Thread();
			//System.out.println(t.getName() + ":" + i);
			System.out.println(Thread.currentThread().getName() + ":" + i + "-" + num);
		}
	}

}
