package com.itheima01;

public class DemoMath01 {

	public static void main(String[] args) {
		//Math.random()会生成大于等于0.0并且小于等于1.0的伪随机数
		for(int i=0; i<10; i++){
			System.out.println(Math.random());
		}
		//生成1-100的随机数
		//Math.random()0.00000000 - 0.999999999999
		//Math.randem()*100 =======>   0.00000000 - 99.99999999999
		//(int)(Math.random()*100)  =======> 0 - 99
		//(int)(Math.random()*100)+1
		
		for(int i=0; i<10; i++){
			System.out.println((int)(Math.random()*100)+1);
		}
	}

}
