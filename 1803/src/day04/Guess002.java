package day04;

import java.util.Scanner;

public class Guess002 {

	public static void main(String[] args) {
  //�����ʾ��̫���ˣ�̫С��
		Scanner scan = new Scanner(System.in);
		int num =250;
		System.out.println("�°ɣ�");
		int guess =scan.nextInt();
		while(guess!=num){
			if(guess>num){
				System.out.println("̫����");
			}else{
				System.out.println("̫С��");
			}				
			System.out.println("�°ɣ�");
			guess=scan.nextInt();
			
			
		}System.out.println("��ϲ�㣡�¶��ˣ�");

	}

	}


