package homework;

public class Test03 {

	public static void main(String[] args) {
		int[] arr = {10,20};
		int a = arr[0];
		int b = arr[1];
		
		int sum = sum(a,b);
		System.out.println("sum:"+sum);
	}
	
	public static int sum(int a, int b){
		return a+b;
	}

}
