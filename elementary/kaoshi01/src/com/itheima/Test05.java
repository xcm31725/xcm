package com.itheima;

public class Test05 {

	public static void main(String[] args) {
		int count = 0;
		for(int i=1000; i<=9999; i++){
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/100%10;
			int qian = i/1000%10;
			
			if((ge+bai)==(shi+qian) && (ge%2==0) /*&& (ge!=0)*/ && (qian%2!=0)){
				count++;
				if(count%5==0){
					System.out.println();
				}else{
					System.out.print(i+" ");
				}
			}
			
		}
		System.out.println("符合条件的数字总共有："+count+"个");

	}

}
