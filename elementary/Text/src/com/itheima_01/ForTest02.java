package com.itheima_01;

public class ForTest02 {

	public static void main(String[] args) {
		int add = 0;
		for(int i=1; i<=100; i++){
			if((i % 3 == 0) && (i % 5 == 0)){
				System.out.println("1~100֮��ȿ�������3Ҳ��������5����Ϊ��"+i);
				add++;
			}
		}
		System.out.println("��"+add+"��");
	}

}
