package day04;
import java.util.Scanner;
public class Guessing01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 300;//×÷±×³ÌÐò
		System.out.println("²Â°É£¡");
		int guess = scan.nextInt();
		while(guess!=num){
			System.out.println("²Â°É");
			guess = scan.nextInt();
			
			
		}System.out.println("¹§Ï²Äã£¬²Â¶ÔÁË£¡");
	}

}
