package bianlishuzu;

public class ArrayTest01 {

	public static void main(String[] args) {
		int[] arr = {12,34,65,21,43};
		
		int maxIndex = 0;
		
		for(int i=0; i<arr.length; i++){
			if(arr[maxIndex]<arr[i]){//�����ֵ������
				maxIndex = i;
			}
		}
		System.out.println("maxIndex="+maxIndex);
		System.out.println(arr[maxIndex]);
	}

}
