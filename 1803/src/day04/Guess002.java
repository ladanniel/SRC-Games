package day04;

import java.util.Scanner;

public class Guess002 {

	public static void main(String[] args) {
  //添加提示，太大了，太小了
		Scanner scan = new Scanner(System.in);
		int num =250;
		System.out.println("猜吧！");
		int guess =scan.nextInt();
		while(guess!=num){
			if(guess>num){
				System.out.println("太大了");
			}else{
				System.out.println("太小了");
			}				
			System.out.println("猜吧！");
			guess=scan.nextInt();
			
			
		}System.out.println("恭喜你！猜对了！");

	}

	}


