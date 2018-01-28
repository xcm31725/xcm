package com.thread;
/*
 * Thread类中的run()方法实现
 * 		@Override
	    public void run() {
	        if (target != null) {//判断任务类对象是否为null
	            target.run();
	        }
	    }
	
	当启动线程时,系统会调用run()方法,谁的run()方法? 线程类对象的run()
 */
public class ThreadTest1 {

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {	//任务对象
					
						@Override
						public void run() {
							System.out.println("Runnable xcm");
						}
					}) {
						@Override
						public void run() {	//线程对象
							System.out.println("Thread xgd");
						}
					};
					
		t.start();
	}

}
