package com.itheima;

public class MethodDemo02 {

	public static void main(String[] args) {
		printFlower();
	}
	
	//��ӡˮ�ɻ���       ��λ*��λ*��λ+ʮλ*ʮλ*ʮλ+��λ*��λ*��λ=�����
	public static void printFlower(){
		for (int i = 100; i < 1000; i++) {
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/100;
			
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
				System.out.println(i);
			}
		}
	}

}
