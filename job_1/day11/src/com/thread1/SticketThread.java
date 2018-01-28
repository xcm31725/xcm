package com.thread1;

public class SticketThread implements Runnable{
	static int stiecket = 50;
	//Object obj = new Object();
	
	@Override
	public void run() {
		
		while(true) {
			//synchronized (obj) {
			/*synchronized (this) {
				method();
			}*/	
			//method();
			//method2();
			method3();
			
		}
	}
	//非静态同步方法
	private synchronized void method3() {
		if(stiecket > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName() + ":" + stiecket--);
		}
	}
	
	//静态同步方法
	private static synchronized void method2() {
		if(stiecket > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName() + ":" + stiecket--);
		}
	}
	
	//同步代码块
	private void method() {
		synchronized (this){
			if(stiecket > 0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName() + ":" + stiecket--);
			}
		}
	}

}
