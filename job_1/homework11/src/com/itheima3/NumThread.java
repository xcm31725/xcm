package com.itheima3;

import java.util.ArrayList;
import java.util.Random;

/*
 * 有一个抽奖箱里面有标有1-100数字的乒乓球,让两个人随机去抽奖,
		打印抽的号码,直到将抽奖箱中的乒乓球被取完  
 */
public class NumThread implements Runnable{

	private ArrayList<Integer> list = new ArrayList<Integer>();
	
	private static NumThread num;
	
	private NumThread() {
		
		for(int i = 1; i <= 100; i++) {
			list.add(i);
		}
	}
	
	public static NumThread lanHan(){
		synchronized(NumThread.class) {
			if(num == null) {
				num = new NumThread();
			}
		}
		return num;
	}
	
	

	@Override
	public void run() {
		
		Random r = new Random();
		
		while(true) {
			synchronized (this) {
				if(list.size() > 0 ) {
					Integer result = list.remove(r.nextInt(list.size()));
					
					System.out.println(Thread.currentThread().getName() + "抽到了" + result + "号");
				}else {
					return;
				}
				
			}
		}
	}
	
	
	/*private int n = 100;
	@Override
	public void run() {
		while(true) {
			synchronized (NumThread.class) {
				
				if(n > 0){
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println(Thread.currentThread().getName() + ":" + n--);
				}
			}
		}
	}*/

}
