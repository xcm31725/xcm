package com.recurrence;
/**
 * 
 * @ClassName: RecurrenceTest1  
 * @Description: TODO �����һ�����һ���ף��ڶ�����������ף���������������ף����ĸ���Ű�����
 * 
 * ������
 * 		��һ��1  2^0
 * 		�����2  2^1
 * 		������4  2^2
 * 		���ģ�8  2^3
 * 		���壺16 2^4
 * @author sudong
 * @date 2018��1��22�� ����4:39:24  
 *
 */
public class RecurrenceTest1 {

	public static void main(String[] args) {
		//System.out.println(Math.pow(2, 1));
		System.out.println(mi1(5));
	}
	public static int mi1(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += mi(i);
		}
		return sum;
	} 
	
	public static double mi(int n) {
		
		if(n == 1) {
			return 1;
		}else {
			//return Math.pow(2,mi(n-1));
			return 2*mi(n-1);
		}
	} 

}
