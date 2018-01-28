package com.thread2;
//µ¥Àû
//¶öººÊ½
public class MPTesk implements Runnable{
	private static MPTesk tesk = new MPTesk();
	
	private MPTesk() {}
	
	public static MPTesk eHan() {
		return tesk;
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
