package com.itheima05;

import java.util.ArrayList;
import java.util.Random;

/*
 *  a. 随机生成8个1-20之间的偶数，存放到合适的集合中；
                PS: 范围包括1和20
        b. 计算出这些随机数的平均值并输出; 
        c. 将小于平均值的数字从集合中删除；

 * */
public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		Random r = new Random();
		int sum = 0;
		for(int i=0;i<8;i++){
			int num = r.nextInt(10)+1;
			sum += num*2;
			array.add(num*2);
		}
		
		System.out.println(array);
		int avg = sum/array.size();
		System.out.println("avg:"+avg);
		
		for (int i = 0; i < array.size(); i++) {
			int n = array.get(i);
			if(avg>n){
				array.remove(i);
				i--;
			}
		}
		System.out.println(array);
		/*for(int i=0;i<8;i++){
			int n = r.nextInt(20)+1;
			if(n%2==0){
				sum += n;
			}
		}
		while(true){
			int n = r.nextInt(20)+1;
			if(n % 2==0){
				for(int i=0;i<8;i++){
					//int n = r.nextInt(20)+1;
					sum += n;
				}
			}
			break;
			
		}*/
		
		
	}

}
