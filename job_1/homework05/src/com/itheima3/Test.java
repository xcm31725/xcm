package com.itheima3;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 4������¼������һ����ݣ��жϸ��������껹��ƽ��
		��ʾ:
			1,2�·ݵ������Ϳ���ȷ�����������껹��ƽ��
			2,��ʱ������Ϊ������ݵ�3��1��,Ȼ��ʱ����ǰ����һ�����2�·����һ��

			ʹ��Calendar���е�add������set����
			
			set(int year, int month, int day)
			add(int field, int i)
 * */
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("���������");
			int a = sc.nextInt();
			//String s = a + "";
			
			Calendar c = Calendar.getInstance();
			
			c.set(a,2,1);
			c.add(Calendar.DAY_OF_MONTH, -1);
			int b = c.get(Calendar.DAY_OF_MONTH);
			if(b == 28){
				System.out.println("ƽ��");
			}else{
				System.out.println("����");
			}
			
		} catch (Exception e) {
			System.out.println("���������ݲ�����Ҫ��");
		}
		
		
	}

}
