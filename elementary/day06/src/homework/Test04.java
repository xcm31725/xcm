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
			System.out.println("������û���������");
		}
	}
	
	public static void print1(int[] brr,int key){
		//ʲôʱ����Ҫ��flag�أ��������������е�ÿһ��Ԫ�ز��ܵõ��𰸵�ʱ�����Ǿ�����flag��
		boolean flag = false;
		for (int i = 0; i < brr.length; i++) {
			if(key == brr[i]){
				System.out.print(i+" ");
				flag = true;
			}
		}
		if(!flag){
			System.out.println("������û���������");
		}
	}

}
