package HomeWorkDemo;
import java.util.Scanner;
public class Guessing {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		int num = 250;
		System.out.println("�°ɣ�");
		int guess = scan.nextInt();
		while(guess!=num){
			if(guess==0){
            break;				
			}
			
			if(guess>num){
				System.out.println("̫����");
				
			}else if(guess<num){
				System.out.println("̫С��");
				
			}
			System.out.println("�°�");
			guess = scan.nextInt();
			
		}
		
	if(guess==num){
		System.out.println("��ϲ�㣡�¶��ˣ�");

	}else{
		System.out.println("�´������ɣ�");
	}
	}
}
