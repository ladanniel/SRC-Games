package day04;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num = (int)(Math.random()*100);
		System.out.println(num);
		int guess;
		do{System.out.println("猜吧");//为什么要进行判定，因为想要得到输出结果就必须进行判定
		guess=scan.nextInt();
		if(guess==0){
			break;
			
		}
		if(guess>num){
			System.out.println("太大了吧");
			
		}else if(guess<num){
			System.out.println("太小了吧");
			
			
		}
		
			}while(guess!=num);
		if(guess==num){
			System.out.println("恭喜你，答对了！");
			
		}else{
			System.out.println("欢迎下次再来");
		}
		
		
	}
		
	}
		
		
		
	

		

	


