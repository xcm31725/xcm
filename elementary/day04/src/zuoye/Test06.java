package zuoye;

import java.util.Random;

public class Test06 {

	public static void main(String[] args) {
		int[]  arr = new int[10];
		
		Random r = new Random();
		
		a:for (int i = 0; i < arr.length; ) {
			//����һ�������
			int n = r.nextInt(10);
			//�ж��������Ƿ��Ѿ�������������
			for (int j = 0; j < i; j++) {
				if(arr[j]==n){
					//��������������ת��12�У����²��������
					continue a;//a:��ָ����˼����ת������ı�ǣ��൱��ê����
				}
			}
			arr[i] = n;
			i++;
			//System.out.println(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
