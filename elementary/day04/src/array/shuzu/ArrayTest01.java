package array.shuzu;

public class ArrayTest01 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		
		//�����������Ԫ��
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		//�������е�Ԫ�ظ�ֵ
		arr[0] = 100;
		arr[2] = 200;
		
		//�ٴ������������Ԫ��
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

	}

}
