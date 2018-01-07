package homework;

public class Teat2_1 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		printArray(arr);
		System.out.println("-------------");
		pan(arr);
		//printArray(arr);
	}
	
	public static void printArray(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void pan(int[] arr){
		int count = 0;
		
		int min = 0;
		int max = arr.length-1;
		
		while(min<max){
			while(arr[min]%2!=0 && min<max){
				min++;
			}
			while(arr[max]%2==0 && min<max){
				max--;
			}
			/*for(;min<max;){
				if(arr[min]%2!=0){
					min++;
				}
				if(arr[max]%2==0){
					max--;
				}
			}*/
			
			int temp = arr[min];
			arr[min] = arr[max];
			arr[max] = temp;
			
		}
		printArray(arr);
	}

}
