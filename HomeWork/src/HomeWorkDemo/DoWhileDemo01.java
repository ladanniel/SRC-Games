package HomeWorkDemo;
import java.util.Scanner;
public class DoWhileDemo01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = (int)(Math.random()*1000);
		System.out.println(num);
		int guess;
		do{
			System.out.println("�°�");
			guess = scan.nextInt();
			if(guess==0){
				break;
			}
			if(guess>num){
				System.out.println("̫����");
	
			}else if(guess<num){
				System.out.println("̫С��");
			}
			
	
		}while(guess!=num);
		
		if(guess==num){
			System.out.println("��ϲ�㣬�¶��ˣ�");
		
			
		}else{System.out.println("��ӭ�´�������");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Scanner scan = new Scanner(System.in);
		int num = (int)(Math.random()*1000);
		System.out.println(num);
		int guess;
		do{
			
			System.out.println("�°ɣ�");
		    guess = scan.nextInt();
		    if(guess==0){
				break;
					
				}
		    if(guess>num){
		    	System.out.println("̫���˰�");
		    	
		    }else if(guess<num){
		    	System.out.println("̫С�˰�");
		    	
		    }
		    
		    
		
			
		}while(guess!=num);
		
		if (guess==num){
			System.out.println("��ϲ�㣡�¶��ˣ�");
		}else{System.out.println("��ӭ�´�����");
			
		}*/
		}
}


