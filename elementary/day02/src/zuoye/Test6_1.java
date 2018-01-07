package zuoye;

public class Test6_1 {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		
		int c = ss(a,b);
		System.out.println(c);

	}
	public static int ss(int a,int b){
		int c = (a>b)?(a+b):(a*b);
		
		return c;
	}

}
