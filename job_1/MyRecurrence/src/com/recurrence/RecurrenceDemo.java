package com.recurrence;
/*
 * ������5�Ľ׳�
 * 5! = 5 * 4 * 3 * 2 * 1;  //120
 * 5! = 5 * 4!;					//120
 * 		4! = 4 * 3!;			//24
 * 			3! = 3 * 2!;		//6
 * 				2! = 2 * 1!;	//2
 * 					1! = 1;     //1
	n! = n * (n - 1)!
	
	�ݹ飺�Ѵ������ɺܶ�С���⣬Ȼ���ٰ�С�����ɸ����С���⣬
			�����ǰѸ���С�������ˣ�С����Ҳ�����
				����С����Ľ����������Ҳ��֮�����
	�ڷ��������ϵĵ��÷����Լ�
	
	�ݹ�ע�����
			�ݹ�һ��Ҫ�г��ڣ��ڴ����
			�ݹ�������˹��࣬�ڴ����
			
	public void show(int n) {//5
		//����
		if(n == 0) {
			return;
		}
		
		show(n - 1);
	}
**/
public class RecurrenceDemo {

	public static void main(String[] args) {
		int jc = jC(5);
		System.out.println(jc);
	}
	
	//��һ�����Ľ׳�
	public static int jC(int n) {
		//�����г���
		if(n == 1){
			return 1;
		}else {
			return n * jC(n - 1);
		}
	}
}
