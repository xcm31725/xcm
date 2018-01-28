package com.thread1;
/**
 * 
 * @ClassName: ThreadTest1  
 * @Description: TODO
 * 模拟火车站售票
 * 		分析：
 * 			首先需要有火车的总票数，每售出一张票则数量减一
 * 			当火车票的数量小于1的时候，停止售票
 * 			使用多线程模拟多个窗口进行售票
 * 			当火车票全部售完，火车站也一样敞开大门欢迎我们
 * 
 * static void sleep(long millis, int nanos) 让当前线程休息会以毫秒值为准
 * @author sudong
 * @date 2018年1月22日 下午4:20:04  
 *
 */
public class ThreadTest1 {

	public static void main(String[] args) {
		TicketThread tt = new TicketThread();
		
		Thread t = new Thread(tt);
		t.setName("窗口1");
		
		Thread t2 = new Thread(tt);
		t2.setName("窗口2");
		
		Thread t3 = new Thread(tt);
		t3.setName("窗口3");
		
		t.start();
		t2.start();
		t3.start();
	}

}
