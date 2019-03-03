package ScoreLeavel;
  import java.util.Scanner;
  
public class Command {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入数字");
		int command = scan.nextInt();//nextInt：随机输入数字
		if(command==1){
			System.out.println("显示全部记录");
		}else if(command==2){
			System.out.println("查询登录记录");
		}else if(command==0){
			System.out.println("欢迎下次再来");
			
		}else{
			System.out.println("输入错误");
		}
			//能用switch ....case 语法的，if.....else if 语法都能用，反之则不一定
		/*switch(command){
		case 1:
			System.out.println("显示全部记录");
			break;
		case 2:
			System.out.println("查询登录记录");
			break;
		case 0:
			System.out.println("欢迎下次再来");
			break;
		default :
			System.out.println("输入错误");*/
		}

	}


