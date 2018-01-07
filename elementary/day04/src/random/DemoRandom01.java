package random;

import java.util.Random;
import java.util.Scanner;

public class DemoRandom01 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int i = r.nextInt(100)+1;
		
		//System.out.println(i);
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个数（0~100）之间：");
		int count = 0;
		while(true){
			
			int number = sc.nextInt();
			
			if(number>i){
				System.out.println("你猜的数字大了");
				System.out.print("请重新输入一个数在（0~100）之间：");
			}else if(number<i){
				System.out.println("你猜的数字小了");
				System.out.print("请重新输入一个数在（0~100）之间：");
			}else{
				System.out.println("恭喜你猜对了");
				break;
			}
			count++;
		}
	}

}
