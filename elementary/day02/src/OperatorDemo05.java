/*
 * 三元运算符：
 * 		定义格式：关系表达式?表达式1:表达式2;
 * 
 * 		执行流程：
 * 			A：计算关系表达式，看是false还是true
 * 			B：如果是true，表达式1就是结果
 * 			       如果是false，表达式2是结果
 * 三元运算符的结果类型，看表达式1和表达式2的类型
 * */
public class OperatorDemo05 {

	public static void main(String[] args) {
		int a = 21;
		int b = 30;
		int x = 40;
		
		//int max = (a>b)?(a>x?a:x):(b>x?b:x);
		int temp = (a>b)?a:b;
		int max = (temp>x)?temp:x;
		
		System.out.println(max);
		
		int c = a>b?a:b;
		System.out.println(c);
		
		String str = a%2==0?"偶数":"奇数";
		System.out.println(str);
		
		//boolean falg = a==b?true:false;
		boolean falg = (a==b);
		System.out.println(falg);
	}

}


