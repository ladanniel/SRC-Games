package HomeWorkDemo;

import java.util.Scanner;

public class ScoreRank {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("成绩排名为：");
		int score;
		score=(int)scan.nextInt();
		if(score>=90){
			   System.out.println("A级"+"优秀");		
			}else if(80<=score && score<90){
				System.out.println("B级"+"良好");
				
			}else if(70<=score && score<80){
				System.out.println("C级"+"中等");
				
			}else if(60<=score && score<70){
				System.out.println("D级"+"及格");
				
			}else {
				System.out.println("E级"+"不及格");
			}
		
		

	}

	}
