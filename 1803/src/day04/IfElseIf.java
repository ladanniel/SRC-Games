package day04;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num = (int)(Math.random()*100);
		System.out.println(num);
		int guess;
		do{System.out.println("�°�");//ΪʲôҪ�����ж�����Ϊ��Ҫ�õ��������ͱ�������ж�
		guess=scan.nextInt();
		if(guess==0){
			break;
			
		}
		if(guess>num){
			System.out.println("̫���˰�");
			
		}else if(guess<num){
			System.out.println("̫С�˰�");
			
			
		}
		
			}while(guess!=num);
		if(guess==num){
			System.out.println("��ϲ�㣬����ˣ�");
			
		}else{
			System.out.println("��ӭ�´�����");
		}
		
		
	}
		
	}
		
		
		
	

		

	


