package day04;
import java.util.Scanner;
public class Guessing {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		int num = 250;
		System.out.println("猜吧！");
		int guess = scan.nextInt();
		while(guess!=num){
			if(guess==0){
            break;				
			}
			
			if(guess>num){
				System.out.println("太大了");
				
			}else if(guess<num){
				System.out.println("太小了");
				
			}
			System.out.println("猜吧");
			guess = scan.nextInt();
			
		}
		
	if(guess==num){
		System.out.println("恭喜你！猜对了！");

	}else{
		System.out.println("下次再来吧！");
	}
	}
}

