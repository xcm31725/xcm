package com.itheima_06;
/*
 * ����ѭ��������
 * 		A:do...while����ִ��һ��ѭ����
 * 		B:for,whileѭ�����ж������Ƿ������Ȼ������Ƿ�ִ��ѭ����
 * 
 * for��while��С����
 * 		forѭ���ĳ�ʼ����������ѭ�������󣬲����Ա����ʡ���whileѭ���ĳ�ʼ���������ǿ��Ա�����ʹ�õġ�
 * 		�����ʼ�����������滹Ҫ�������ʣ���ʹ��while�������Ƽ�ʹ��for��
 * 
 * ѭ����ʹ���Ƽ���
 * 		for -- while -- do...while
 */
public class DoWhileDemo2 {
	public static void main(String[] args) {
		/*
		int x = 3;
		while(x<3) {
			System.out.println("�Ұ�����ϼ");
			x++;
		}
		System.out.println("--------------");
		int y = 3;
		do {
			System.out.println("�Ұ�����ϼ");
			y++;
		}while(y<3);
		*/
		
		
		for(int x=1; x<=10; x++){
			System.out.println("�������Java");
		}
		//�����x�޷���������
		//System.out.println(x);
		System.out.println("-----------------");
		
		int y = 1;
		while(y<=10) {
			System.out.println("�������Java");
			y++;
		}
		System.out.println(y);
	}
}
