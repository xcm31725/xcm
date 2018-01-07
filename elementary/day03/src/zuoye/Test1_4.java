package zuoye;

import java.util.Scanner;

public class Test1_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in );
		
		System.out.println("请输入一个大于100的三位数：");
		int i = sc.nextInt();

		int sum = 0;
		
		for(int x = 100;x <= i;x++){
//			int ge = i%10;
//			int shi = i/10%10;
//			int bai = i/100;
			if((x%10 != 7) &&(x/10%10 != 5) &&(x/100 != 3)){
				sum += x;
			}
		}
		System.out.println("sum=" + sum);
	}
}

