package bianlishuzu;
/*
 * ��ί������⣬ȥ����߷ֺ���ͷ�
 */
public class ArrayTest02 {

	public static void main(String[] args) {
		int[] arr = {12,34,65,21,43};
		
		int max = arr[0];
		int min = arr[0];
		int sum = arr[0];
		for(int i=1;i<arr.length; i++){
			if(arr[i]>max){//�����е����ֵ
				max = arr[i];
			}
			
			if(arr[i]<min){//�����е���Сֵ
				min = arr[i];
			}
			sum += arr[i];
		}
		int agv = (sum-min-max)/(arr.length-2);
		System.out.println(agv);

	}

}
