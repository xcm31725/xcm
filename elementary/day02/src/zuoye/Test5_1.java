package zuoye;

import java.util.Scanner;

public class Test5_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.err.print("请输入长方形的高：");
		int g = sc.nextInt();
		System.err.print("请输入长方形的宽：");
		int k = sc.nextInt();
		
		int s = g*k;
		int l = (g+k)*2;
		System.out.println("长方形的面积s="+s);
		System.out.println("长方形的周长l="+l);

	}

}
