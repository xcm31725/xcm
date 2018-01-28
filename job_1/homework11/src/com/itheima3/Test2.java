package com.itheima3;
/**
 * 
 * @ClassName: Test2  
 * @Description: TODO
 * 3、有一个抽奖箱里面有标有1-100数字的乒乓球,让两个人随机去抽奖,
		打印抽的号码,直到将抽奖箱中的乒乓球被取完  
 * @author sudong
 * @date 2018年1月23日 下午8:34:29  
 *
 */
public class Test2 {

	public static void main(String[] args) {
		NumThread nt = NumThread.lanHan();
		
		Thread t = new Thread(nt);
		t.setName("xcm");
		t.start();
		
		Thread t1 = new Thread(nt);
		t1.setName("xgd");
		t1.start();
	}

}
