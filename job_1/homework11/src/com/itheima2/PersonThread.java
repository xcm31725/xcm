package com.itheima2;

public class PersonThread implements Runnable{
	private static PersonThread person = new PersonThread();
	
	private PersonThread() {}
	
	public static PersonThread eHan() {
		return person;
	}
	
	private int per = 100;
	
	@Override
	public void run() {
		
		while(true) {
			synchronized(PersonThread.class) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				if(per > 0) {
					System.out.println(Thread.currentThread().getName() + ":" + per--);
				}
			}
		}
	}

}
