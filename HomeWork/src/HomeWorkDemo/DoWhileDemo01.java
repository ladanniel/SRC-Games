package HomeWorkDemo;
import java.util.Scanner;
public class DoWhileDemo01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = (int)(Math.random()*1000);
		System.out.println(num);
		int guess;
		do{
			System.out.println("猜吧");
			guess = scan.nextInt();
			if(guess==0){
				break;
			}
			if(guess>num){
				System.out.println("太大了");
	
			}else if(guess<num){
				System.out.println("太小了");
			}
			
	
		}while(guess!=num);
		
		if(guess==num){
			System.out.println("恭喜你，猜对了！");
		
			
		}else{System.out.println("欢迎下次再来！");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Scanner scan = new Scanner(System.in);
		int num = (int)(Math.random()*1000);
		System.out.println(num);
		int guess;
		do{
			
			System.out.println("猜吧！");
		    guess = scan.nextInt();
		    if(guess==0){
				break;
					
				}
		    if(guess>num){
		    	System.out.println("太大了吧");
		    	
		    }else if(guess<num){
		    	System.out.println("太小了吧");
		    	
		    }
		    
		    
		
			
		}while(guess!=num);
		
		if (guess==num){
			System.out.println("恭喜你！猜对了！");
		}else{System.out.println("欢迎下次再来");
			
		}*/
		}
}


