package com.recurrence;
/**
 * 
 * @ClassName: RecurrenceTest1  
 * @Description: TODO 象棋第一个格放一粒米，第二个格放两粒米，第三个格放四粒米，第四个格放八粒米
 * 
 * 分析：
 * 		格一：1  2^0
 * 		格二：2  2^1
 * 		格三：4  2^2
 * 		格四：8  2^3
 * 		格五：16 2^4
 * @author sudong
 * @date 2018年1月22日 下午4:39:24  
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
