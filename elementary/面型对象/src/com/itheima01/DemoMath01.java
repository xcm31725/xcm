package com.itheima01;

public class DemoMath01 {

	public static void main(String[] args) {
		//Math.random()�����ɴ��ڵ���0.0����С�ڵ���1.0��α�����
		for(int i=0; i<10; i++){
			System.out.println(Math.random());
		}
		//����1-100�������
		//Math.random()0.00000000 - 0.999999999999
		//Math.randem()*100 =======>   0.00000000 - 99.99999999999
		//(int)(Math.random()*100)  =======> 0 - 99
		//(int)(Math.random()*100)+1
		
		for(int i=0; i<10; i++){
			System.out.println((int)(Math.random()*100)+1);
		}
	}

}
