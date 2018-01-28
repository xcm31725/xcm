package com.thread;
/**
 * 
 * @ClassName: ThreadDemo2  
 * @Description: TODO
 * 创建线程的另一种方法是声明实现 Runnable 接口的类。该类然后实现 run 方法。
 * 然后可以分配该类的实例，在创建 Thread 时作为一个参数来传递并启动。
 * 采用这种风格的同一个例子如下所示：
 * 
 * Thread(Runnable target) : 分配新的 Thread 对象。
 * static Thread currentThread() : 返回对当前正在执行的线程对象的引用。 
 * 
 * @author sudong
 * @date 2018年1月22日 下午3:40:15  
 *
 */
public class ThreadDemo2 {

	public static void main(String[] args) {
		MyThread1 mt = new MyThread1(100);
		Thread t = new Thread(mt);
		t.setName("xcm");
		
		t.start();
		
		MyThread1 mt1 = new MyThread1(100);
		new Thread(mt1).setName("czm");
		new Thread(mt1).start();
	}

}
