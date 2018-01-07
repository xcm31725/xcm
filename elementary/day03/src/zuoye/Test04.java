package zuoye;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("请输入一个大于100的三位数：");
		int a = sc.nextInt();
		
		int sum = 0;
		for(int i=100; i<=a; i++){
			if((i%10!=7)&&(i/10%10!=5)&&(i/100!=3)){
				//System.out.println(i);
				sum += i;
			}
		}
		System.out.println(sum);
		

	}

}
















