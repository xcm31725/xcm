package bianlishuzu;

public class ArrayDemo02 {

	public static void main(String[] args) {
		int[] arr = {12,34,65,21,43};
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0;i<arr.length; i++){
			if(arr[i]>max){//�����е����ֵ
				max = arr[i];
			}
			
			if(arr[i]<min){//�����е���Сֵ
				min = arr[i];
			}
		}
		System.out.println("max="+max);
		System.out.println("min="+min);
	}

}
