/*
 * ��Ԫ�������
 * 		�����ʽ����ϵ���ʽ?���ʽ1:���ʽ2;
 * 
 * 		ִ�����̣�
 * 			A�������ϵ���ʽ������false����true
 * 			B�������true�����ʽ1���ǽ��
 * 			       �����false�����ʽ2�ǽ��
 * ��Ԫ������Ľ�����ͣ������ʽ1�ͱ��ʽ2������
 * */
public class OperatorDemo05 {

	public static void main(String[] args) {
		int a = 21;
		int b = 30;
		int x = 40;
		
		//int max = (a>b)?(a>x?a:x):(b>x?b:x);
		int temp = (a>b)?a:b;
		int max = (temp>x)?temp:x;
		
		System.out.println(max);
		
		int c = a>b?a:b;
		System.out.println(c);
		
		String str = a%2==0?"ż��":"����";
		System.out.println(str);
		
		//boolean falg = a==b?true:false;
		boolean falg = (a==b);
		System.out.println(falg);
	}

}


