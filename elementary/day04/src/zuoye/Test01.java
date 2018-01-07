package zuoye;

public class Test01 {

	public static void main(String[] args) {
		int[] arr = {12,35,54,1,5};
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		System.out.println("最小值为："+min);
	}

}
