package com.thread;
/**
 * 
 * @ClassName: ThreadDemo1  
 * @Description: TODO
 * 多线程的实现方式：
 * 		方式1：一种方法是将声明Tread的子类。改子类应重写Thread类的run方法。接下来可以分配并启动改子类的实例
 * 
 * Thread
 * 		String getName()：返回该线程的名称。
 * 		void setName()：改变线程的名称，使之与参数name形同。
 * CPU执行程序的随机性
 * @author sudong
 * @date 2018年1月22日 下午3:01:30  
 *
 */
public class ThreadDemo1 {

	public static void main(String[] args) {
		//创建线程实例
		MyThread mt = new MyThread();
		//重写线程的名字
		mt.setName("zc");
		
		//启动线程
		mt.start();
		
		//创建线程实例
		MyThread mt1 = new MyThread();
		//重写线程的名字
		mt1.setName("sd");
		
		//启动线程
		mt1.start();
	}

}
