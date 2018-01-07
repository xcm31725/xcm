package bianlishuzu;
/*
 * 评委打分问题，去掉最高分和最低分
 */
public class ArrayTest02 {

	public static void main(String[] args) {
		int[] arr = {12,34,65,21,43};
		
		int max = arr[0];
		int min = arr[0];
		int sum = arr[0];
		for(int i=1;i<arr.length; i++){
			if(arr[i]>max){//数组中的最大值
				max = arr[i];
			}
			
			if(arr[i]<min){//数组中的最小值
				min = arr[i];
			}
			sum += arr[i];
		}
		int agv = (sum-min-max)/(arr.length-2);
		System.out.println(agv);

	}

}
