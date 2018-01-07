package homework;

public class Test06 {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60};

//		int result = index(arr);
//		System.out.println("result:"+result);
		
		int result = index(arr);
		System.out.println("result:"+result);
	}

	public static int index(int[] arr){
		int index = -1;
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i]){
				max = arr[i];
				index = i;
			}
		}
//		return max;
		return index;
	}
}
