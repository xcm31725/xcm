package erweizhuzu;
/*
 * ��λ��������������Ի�ȡ��ÿһ��һά����
 * ÿһ��һά�����������ʹ�ÿ��Ի�ȡһά�����Ԫ��
 * */
public class ArrayArrayDemo01 {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		/*System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println(arr[0][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[2][2]);*/
		
		//��ȡ��һ����λ�����еĵ�һ��һά����
		for(int a=0; a<arr[0].length; a++){
			System.out.println(arr[0][a]);
		}
		
		//��ȡ�ڶ�����λ�����еĵڶ���һά����
		for(int a=0; a<arr[1].length; a++){
			System.out.println(arr[1][a]);
		}
		
		//��ȡ��������λ�����еĵ�����һά����
		for(int a=0; a<arr[2].length; a++){
			System.out.println(arr[2][a]);
		}
		
		System.out.println("-----------------");
		for(int b=0;b<arr.length;b++){
			for(int a=0; a<arr[b].length; a++){
				System.out.print(arr[a][b]+"\t");
			}
			System.out.println();
		}
	}

}
