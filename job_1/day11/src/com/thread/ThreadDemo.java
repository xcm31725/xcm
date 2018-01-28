package com.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.setName("xcm");
		mt.start();
		
		MyThread mt1 = new MyThread();
		mt1.setName("czm");
		mt1.start();
	}

}
