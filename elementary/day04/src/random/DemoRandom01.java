package random;

import java.util.Random;
import java.util.Scanner;

public class DemoRandom01 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int i = r.nextInt(100)+1;
		
		//System.out.println(i);
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ������0~100��֮�䣺");
		int count = 0;
		while(true){
			
			int number = sc.nextInt();
			
			if(number>i){
				System.out.println("��µ����ִ���");
				System.out.print("����������һ�����ڣ�0~100��֮�䣺");
			}else if(number<i){
				System.out.println("��µ�����С��");
				System.out.print("����������һ�����ڣ�0~100��֮�䣺");
			}else{
				System.out.println("��ϲ��¶���");
				break;
			}
			count++;
		}
	}

}
