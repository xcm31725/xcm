package zuoye;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("请输入1~5的数字：");
			int a = sc.nextInt();
			switch(a){
			case 1:
				System.out.println("新建");
				break;
			case 2:
				System.out.println("打开文件");
				break;
			case 3:
				System.out.println("保存");
				break;
			case 4:
				System.out.println("刷新");
				break;
			case 5:
				System.out.println("退出");
				System.exit(0);
			default:
				System.out.println("不输入的有误");
			}
		}
		
		/*while(true){
			System.out.print("请输入1~5的数字：");
			int a = sc.nextInt();
			if(a<0&&a>5){
				System.out.println("你输入的数字有误！");
			}else if(a==1){
				System.out.println("新建");
			}else if(a==2){
				System.out.println("打开文件");
			}else if(a==3){
				System.out.println("保存");
			}else if(a==4){
				System.out.println("刷新");
			}else if(a==5){
				System.out.println("退出");
				break;
			}else{
				System.exit(0);
			}
		}*/
		/*switch(a){
		case 1:
			System.out.println("新建");
			break;
		case 2:
			System.out.println("打开文件");
			break;
		case 3:
			System.out.println("保存");
			break;
		case 4:
			System.out.println("刷新");
			break;
		case 5:
			System.out.println("退出");
			break;
		default:
			System.exit(0);
		}*/

	}

}
