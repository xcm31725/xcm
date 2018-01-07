package zuoye;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("请输入工龄：");
		int a = sc.nextInt();
		
		System.out.print("请输入基本工资：");
		int b = sc.nextInt();
		// 2 5 10 25 50 
		int q = 5000,w = 2500,e = 1000,r = 500,t = 200;
		
		int c = 0,d = 0;
		if(a<0||a>15){
			System.out.println("你输入的工龄有误！");
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
		System.out.println("您目前工作了"+a+"年，基本工资为"+b+"元，应涨工资"+d+"元，涨后工资"+c+"元");
		//System.out.println("涨工资后为："+c);
	}

}
