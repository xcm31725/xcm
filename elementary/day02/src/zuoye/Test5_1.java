package zuoye;

import java.util.Scanner;

public class Test5_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.err.print("�����볤���εĸߣ�");
		int g = sc.nextInt();
		System.err.print("�����볤���εĿ�");
		int k = sc.nextInt();
		
		int s = g*k;
		int l = (g+k)*2;
		System.out.println("�����ε����s="+s);
		System.out.println("�����ε��ܳ�l="+l);

	}

}
