package array.shuzu;
/*
 * ���ֳ������쳣
 * 		ArrayIndexOutOfBoundsException���Ǳ�Խ���쳣
 * 			������ԭ�����Ƿ����˲����ڵ�����
 * 		NullPointerException:��ָ���쳣
 * 			������ԭ�������Ѿ���ָ����ڴ�������ˣ��㻹�������������ʸ�Ԫ��
 * */
public class ArrayDemo02 {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		
		//��������Ԫ��
		//System.out.println(arr[3]);
		
		//�������ͣ��ࡢ�ӿڡ�����
		//
		arr = null;
		System.out.println(arr[1]);

	}

}
