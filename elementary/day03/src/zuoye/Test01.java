package zuoye;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��������ĳɼ���");
		int score = sc.nextInt();
		
		//����������غϣ���С����д������
		//ע�⣺��ʹ��else if��ʱ��һ��Ҫ���Լ����ǲ��ǰ����е���������ǵ��ˣ��Ǵ���Ľ�׳��
		if(score<0||score>100){
			System.out.println("������ĳɼ�����");
		}else if(score>=90){
			System.out.println("����");
		}else if(score>=80){
			System.out.println("��");
		}else if(score>=70){
			System.out.println("��");
		}else if(score>=60){
			System.out.println("����");
		}else{
			System.out.println("������");
		}

	}

}

