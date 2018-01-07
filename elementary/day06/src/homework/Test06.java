package homework;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		for(int i=0; i<10; i++){
			System.out.print("请输入第"+(i+1)+"个数：");
			int n = sc.nextInt();
			arr[i] = n;
		}
		
		arrayOuAndJi(arr);
		printArray(arr);
		System.out.println(result(arr));
	}
	
	//打印原数组和处理后的数组
	public static void printArray(int[] arr){
		System.out.print("[");
		
		for (int i = 0; i < arr.length; i++) {
			if(i==arr.length-1){
				System.out.println(arr[i]+"]");
			}else{
				System.out.print(arr[i]+",");
			}
		}
	}
	//{1,2,3,1,4}
	//传入一个int类型数组，输出这个数组中只出现一次的数字及个数
	public static int result(int[] arr){
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(getCount(arr, arr[i]) == 1){
				count++;
				System.out.println(arr[i]);
				System.out.println("------------");
			}
		}
		return count;
	}
	
	public static int getCount(int[] arr,int n){
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == n){
				count++;
			}
		}
		return count;
	}
	//将奇数放在数组的左侧,偶数放在数组的右侧
	public static void arrayOuAndJi(int[] arr){
		int i = 0;
		int j = arr.length-1;
		
		while(i<j){
			while(arr[i]%2 !=0 && i<j){
				i++;
			}
			
			while(arr[j]%2 ==0 && i<j){
				j--;
			}
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
		}
	}

}





















