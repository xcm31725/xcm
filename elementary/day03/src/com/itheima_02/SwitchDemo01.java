package com.itheima_02;

import java.util.Scanner;

/*
 * switch��ʽ���ͣ�
 * 		���ʽ��byte��short��int��char
 * 			JDK5�Ժ������ö��
 * 			JDK7�Ժ�������ַ���
 * 		case�����ֵ�����������ͱ��ʽ��ֵ����ƥ�������
 * 		break����ʾ�жϵ���˼
 * 		default�����е�ֵ����ƥ���ʱ�򣬾�ִ��default
 * ִ�����̣�
 * 		A�����ȼ�����ʽ��ֵ
 * 		B������������������ֵ�����κ�case�����ֵ���бȽϣ�һ����ƥ��ģ���ִ�ж�Ӧ������壬��ִ�еĹ����У�����break�ͽ���
 * */
//ѡ����Ƶڼ�����switch
public class SwitchDemo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���������ڣ�1~7��֮��:");
		int weekday = sc.nextInt();
		
		/*switch(weekday){
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
		*/
		
		//��͸Ч��
		switch(weekday){
		case 1:	
		case 2:	
		case 3:	
		case 4:	
		case 5:
			break;
		case 6:
		case 7:
			System.out.println("������");
			break;
		default:
			System.out.println("���������������");
			break;
		}

	}

}
