package zuoye;

public class Test03 {

	public static void main(String[] args) {
		int[] nums = {5,10,15};
		int[] arr = new int[3];
		
		for(int i=0; i<nums.length; i++){
			arr[i] = nums[i]*2;
			System.out.println("arr["+i+"]="+arr[i]);
		}
	}

}
