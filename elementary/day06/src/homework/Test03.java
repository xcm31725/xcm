package homework;

public class Test03 {

	public static void main(String[] args) {
		int[] arr = {3,4,3,5,7,9}; 
		int key = 0;
		
		System.out.println(getCount(arr,6));
	}
	
	public static int getCount(int[] arr,int key){
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (key == arr[i]) {
				count++;
			}
			//return count;
		}
		return count;
	}

}
