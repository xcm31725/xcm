package com.ithiema6;

import java.util.Scanner;

public class YangHuiTriangle {
public static void main(String[] args) { 
	//��������
	System.out.println("������������ǵ�����:"); 
	Scanner ScRows=new Scanner(System.in); 
	final int Rows=ScRows.nextInt(); 
	//������ά���飬����һά����Ϊ
	//Rows+1;
	int array[][] =new int[Rows+1][]; 
	//ѭ����ʼ������
	for(int i=0;i<=Rows;i++){ 
		//��������Ķ�λ����
	//	array[i]=newint[i+1]; 
	} 
	System.out.println("�������Ϊ:"); 
		YhTriangle(array,Rows); 
	}

	// ����������
	public static void YhTriangle(int array[][], int rows) {
		// �п���
		for (int i = 0; i <= rows; i++) {
			// �п���
			for (int j = 0; j < array[i].length; j++) {
				// ��ֵ����λ����,�����ߵ�Ԫ�ظ�ֵΪ1
				if (i == 0 || j == 0 || j == array[i].length - 1)
					array[i][j] = 1;
				// �������Ϸ�Ԫ�������Ͻ�Ԫ��֮�͸�ֵ����Ԫ���С�
				else
					array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
			}
		}
		// ��ӡ����������
		for (int i = 0; i <= rows; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
