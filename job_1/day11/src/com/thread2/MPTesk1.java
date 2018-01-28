package com.thread2;
//µ¥Àû
//ÀÁººÊ½
public class MPTesk1 implements Runnable{
	
	private static MPTesk1 tesk1;
	
	private MPTesk1() {}
	
	public static synchronized MPTesk1 lanHan() {
		if(tesk1 == null) {
			tesk1 = new MPTesk1();
		}
		
		return tesk1;
	}
	
	
	private int sickets = 50;
	@Override
	public void run() {
		
		while(true) {
			
			synchronized (MPTesk.class) {
				
				if(sickets > 0) {
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println(Thread.currentThread().getName() + ":" + sickets--);
				}
			}
			
		}
	}
}
