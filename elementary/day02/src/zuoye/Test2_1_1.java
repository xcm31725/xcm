package zuoye;

import java.util.Scanner;

public class Test2_1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������С�������е�ֽ�ƣ�");
		int left = sc.nextInt();
		
		System.out.print("������С�������е�ֽ�ƣ�");
		int right = sc.nextInt();
		
		System.out.println("����ǰС�����е�ֽ�ƣ�");
		System.out.println("�����е�ֽ�ƣ�"+left);
		System.out.println("�����е�ֽ�ƣ�"+right);
		
		int temp = left;
		left = right;
		right = temp;
		
		System.out.println("������С�����е�ֽ�ƣ�");
		System.out.println("�����е�ֽ�ƣ�"+left);
		System.out.println("�����е�ֽ�ƣ�"+right);
	}

}
