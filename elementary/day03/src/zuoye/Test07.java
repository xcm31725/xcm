package zuoye;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����빤�䣺");
		int a = sc.nextInt();
		
		System.out.print("������������ʣ�");
		int b = sc.nextInt();
		// 2 5 10 25 50 
		int q = 5000,w = 2500,e = 1000,r = 500,t = 200;
		
		int c = 0,d = 0;
		if(a<0||a>15){
			System.out.println("������Ĺ�������");
		}else if(a>=10){
			c = b+5000;
			d = q;
		}else if(a>=5){
			c = b+2500;
			d = w;
		}else if(a>=3){
			c = b+1000;
			d = e;
		}else if(a>=1){
			c = b+500;
			d = r;
		}else{
			c = b+200;
			d = t;
		}
		System.out.println("��Ŀǰ������"+a+"�꣬��������Ϊ"+b+"Ԫ��Ӧ�ǹ���"+d+"Ԫ���Ǻ���"+c+"Ԫ");
		//System.out.println("�ǹ��ʺ�Ϊ��"+c);
	}

}
