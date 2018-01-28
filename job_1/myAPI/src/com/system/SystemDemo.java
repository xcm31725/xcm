package com.system;
/*
 * static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
 * 		��ֵ����
 * static long currentTimeMillis() 
 * 		���ص�ǰϵͳʱ��
 * static void exit(int status) 
 * 		��ֹ��ǰJVM�����
 * */
public class SystemDemo {

	public static void main(String[] args) {
		/*
		  * static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		  *  
		  *  sre��Դ����
		  *  srcPos��ָ�����ĸ�����λ�ÿ�ʼ����
		  *  dest��Ŀ������
		  *  destPos����ָ��Ŀ���������Ԫ�ص�����λ��
		  *  length��Ŀ���������Ԫ�صĸ���
	      * */
		//Դ����
		int[] src = {1,2,3,4,5};
		//Ŀ������
		int[] dest = new int[5];
		
		System.arraycopy(src, 0, dest, 0, 5);
		for (int i = 0; i < dest.length; i++) {
			System.out.println(dest[i]);
		}
		
		/*
		 * static long currentTimeMillis() ���Ժ��뷵�ص�ǰϵͳʱ�䣨1970-1-1 0:0:0����������ٺ��룩
		 * 1000���� = 1��
		 * �൱��1970-1-1 0:0:0  0
		 * ���ϵͳʱ����1970-1-1 0:0:0  0
		 * ���ϵͳʱ����1970-1-1 0:0:1  1000
		 * */
		System.out.println(System.currentTimeMillis());
	}

}
