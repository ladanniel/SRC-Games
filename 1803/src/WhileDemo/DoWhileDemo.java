package WhileDemo;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num = (int)(Math.random()*1000);//1000以内的随机数
		System.out.println(num);
		
		
		int guess;//声明与循环量改变合成一个，1-3相同
		do{
			System.out.println("猜吧！");
		    guess =scan.nextInt();
		    if(guess==0){
				break;
				
			}
			if(guess>num){
				System.out.println("太大了");
			}else if(guess<num){
				System.out.println("太小了");
			}				
			
			
		}while(guess!=num);//2
				if(guess==num){
					System.out.println("恭喜你！猜对了！");
				}else{
					System.out.println("欢迎下次再来！");

				}

				}
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Scanner scan = new Scanner(System.in);
		int num =250;
		System.out.println("猜吧！");
		int guess =scan.nextInt();
		while(guess!=num){
			
			if(guess==0){
				break;
				
			}
			if(guess>num){
				System.out.println("太大了");
			}else{
				System.out.println("太小了");
			}				
			System.out.println("猜吧！");
			guess=scan.nextInt();
			
			
			//解答guessing003中存在的问题
		}
	if(guess==num){
		System.out.println("恭喜你！猜对了！");
	}else{
		System.out.println("欢迎下次再来！");*/

	}

	


