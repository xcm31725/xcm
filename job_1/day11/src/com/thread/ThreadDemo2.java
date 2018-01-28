package com.thread;

public class ThreadDemo2 {

	public static void main(String[] args) {
		//method();
		MyThread2 mt = new MyThread2(100);
		
		Thread t = new Thread(mt);
		t.setName("zzc");
		t.start();
		
		MyThread2 mt1 = new MyThread2(200);
		Thread t1 = new Thread(mt1);
		t1.setName("sd");
		t1.start();
	}

	private static void method() {
		MyThread2 mt = new MyThread2(100);
		Thread t = new Thread(mt);
		t.setName("xcm");
		t.start();
		
		Thread t1 = new Thread(mt);
		t1.setName("xcm");
		t1.start();
	}

}
