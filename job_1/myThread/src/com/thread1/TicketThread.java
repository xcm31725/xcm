package com.thread1;
/**
 * 
 * @ClassName: TicketThread  
 * @Description: TODO
 * 问题出现的原因
 * 		要有多个线程
 * 		要有被多个线程所共享的数据
 * 		多个线程并发的访问共享的数据
 * 
 * synchronized:同步（锁），可以修饰代码块和方法，被修饰的代码块和方法一旦被某个线程访问，则直接锁住，其他线程将无法访问
 * 
 * 同步代码块：
 * 		synchronized(锁对象) {
 * 			
 * 		}
 * 
 * 注意：锁对象要被所有线程所共享
 * 
 * 同步：安全性高，效率低
 * 非同步：效率高，安全性低
 * 
 * 同步方法：使用关键字synchronized修饰的方法，一旦被一个线程访问，则整个方法全部锁住，其他线程无法访问
 * 
 * synchronized
 * 
 * 注意：
 * 		非静态同步方法锁对象是this
 * 		静态同步方法的锁对象是当前类的字节码对象
 * 
 * @author sudong
 * @date 2018年1月22日 下午5:08:31  
 *
 */
public class TicketThread implements Runnable{
	static int ticket = 50;
	Object obj = new Object();
	
	@Override
	public void run() {
		while(true) {
			
			/*synchronized (obj) {
				method();
			}*/
			
			//method();
			method1();
		}
	}

	private static synchronized void method1() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if(ticket > 0) {
			System.out.println(Thread.currentThread().getName() + ":" + ticket--);
		}
	}
	
	private synchronized void method() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if(ticket > 0) {
			System.out.println(Thread.currentThread().getName() + ":" + ticket--);
		}
	}

}
