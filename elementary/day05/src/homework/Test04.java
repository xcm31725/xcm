package homework;

public class Test04 {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60};
		
		int min = min(arr);
		System.out.println("min:"+min);
	}
	
	public static int min(int[] arr){
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(min<arr[0]){
				min = arr[i];
			}
		}
		return min;
	}

}
