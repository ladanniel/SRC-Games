package HomeWorkDemo;

import java.util.Scanner;

public class ScoreRank {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("�ɼ�����Ϊ��");
		int score;
		score=(int)scan.nextInt();
		if(score>=90){
			   System.out.println("A��"+"����");		
			}else if(80<=score && score<90){
				System.out.println("B��"+"����");
				
			}else if(70<=score && score<80){
				System.out.println("C��"+"�е�");
				
			}else if(60<=score && score<70){
				System.out.println("D��"+"����");
				
			}else {
				System.out.println("E��"+"������");
			}
		
		

	}

	}
