package day04;
import java.util.Scanner;
public class Guessing01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 300;//���׳���
		System.out.println("�°ɣ�");
		int guess = scan.nextInt();
		while(guess!=num){
			System.out.println("�°�");
			guess = scan.nextInt();
			
			
		}System.out.println("��ϲ�㣬�¶��ˣ�");
	}

}
