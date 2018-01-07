package homework;

public class Test04 {

	public static void main(String[] args) {
		int[] brr = {1,2,3,2};
		int key = 0;
		
		print1(brr,2);
	}
	
	public static void print(int[] brr,int key){
		int count = 0;
		for (int i = 0; i < brr.length; i++) {
			if(key == brr[i]){
				System.out.print(i+" ");
				count++;
			}
		}
		if(count==0){
			System.out.println("数组中没有这个数字");
		}
	}
	
	public static void print1(int[] brr,int key){
		//什么时候需要立flag呢？当遍历完数组中的每一个元素才能得到答案的时候，我们就用立flag。
		boolean flag = false;
		for (int i = 0; i < brr.length; i++) {
			if(key == brr[i]){
				System.out.print(i+" ");
				flag = true;
			}
		}
		if(!flag){
			System.out.println("数组中没有这个数字");
		}
	}

}
