package com.itheima_03;

import java.util.Scanner;

/*
 * switch����ʽ��
 * switch(���ʽ) {
 * 		case ֵ1:
 * 			�����1;
 * 			break;
 * 		case ֵ2:
 * 			�����2;
 * 			break;
 * 		...
 * 		default:
 * 			�����n+1;
 * 			break;
 * }
 * ��ʽ���ͣ�
 * 		���ʽ:byte,short,int,char
 * 			JDK5�Ժ������ö��
 * 			JDK7�Ժ�������ַ���
 * 		case:����Ҫ�ͱ��ʽ���бȽϵ�ֵ
 * 		break:��ʾ�ж�,��������˼��
 * 		default:��ʾ���е��������ƥ���ʱ�򣬾�ִ�������n+1����if����else���ơ�
 * ִ�����̣�
 * 		A:��������ʽ��ֵ
 * 		B:�ü��������ֵ��case�����ֵ���αȽϣ�һ���ж�Ӧ��ֵ����ִ�иô�����䣬��ִ�й����У����� break���ͽ�����
 * 		C:������е�case����ƥ�䣬�ͻ�ִ��default���Ƶ���䣬Ȼ�������
 * ����
 * 		���ݼ���¼�����ֵ1��2��3����7�����Ӧ������һ�����ڶ����������������ա�
 */
public class SwitchDemo {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//��������
		System.out.println("������һ������(1-7)��");
		int weekday = sc.nextInt();
		
		//switch���ʵ��ѡ��
		switch(weekday) {
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("������");
			break;
		default:
			System.out.println("���������������");
			break;
		}
		
		
		
		
		
		
		
	}
}
