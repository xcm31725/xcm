package zuoye;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("������1~5�����֣�");
			int a = sc.nextInt();
			switch(a){
			case 1:
				System.out.println("�½�");
				break;
			case 2:
				System.out.println("���ļ�");
				break;
			case 3:
				System.out.println("����");
				break;
			case 4:
				System.out.println("ˢ��");
				break;
			case 5:
				System.out.println("�˳�");
				System.exit(0);
			default:
				System.out.println("�����������");
			}
		}
		
		/*while(true){
			System.out.print("������1~5�����֣�");
			int a = sc.nextInt();
			if(a<0&&a>5){
				System.out.println("���������������");
			}else if(a==1){
				System.out.println("�½�");
			}else if(a==2){
				System.out.println("���ļ�");
			}else if(a==3){
				System.out.println("����");
			}else if(a==4){
				System.out.println("ˢ��");
			}else if(a==5){
				System.out.println("�˳�");
				break;
			}else{
				System.exit(0);
			}
		}*/
		/*switch(a){
		case 1:
			System.out.println("�½�");
			break;
		case 2:
			System.out.println("���ļ�");
			break;
		case 3:
			System.out.println("����");
			break;
		case 4:
			System.out.println("ˢ��");
			break;
		case 5:
			System.out.println("�˳�");
			break;
		default:
			System.exit(0);
		}*/

	}

}
