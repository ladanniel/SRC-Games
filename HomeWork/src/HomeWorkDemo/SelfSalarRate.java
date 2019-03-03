package HomeWorkDemo;

import java.util.Scanner;

public class SelfSalarRate {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入税前工资");
	    double n =scan.nextInt();
		double  sl = (n-3500);//应纳税部分工资
		
		if(sl>=80000){	
			
			double t =sl*0.45-13505;
			
			System.out.println("应纳税额");
			System.out.println(t);
				
		}else if(55000<=sl&&sl<80000){
			double t =sl*0.35-5505;
			System.out.println("应纳税额");
			System.out.println(t);
			
		}else if(35000<=sl&&sl<55000){
			double t =sl*0.30-2755;
			System.out.println("应纳税额");
			System.out.println(t);
			
		}else if(9000<=sl&&sl<35000){
			double t =sl*0.25-1005;
			System.out.println("应纳税额");
			System.out.println(t);
		}else if(4500<=sl&&sl<9000){
			double t =sl*0.20-555;
			System.out.println("应纳税额");
			System.out.println(t);
		}else if(1500<=sl&&sl<4500){
			double t =sl*0.10-105;
			System.out.println("应纳税额");
			System.out.println(t);
			
		}else if(0<=sl&&sl<1500){
			double t =sl*0.03;
			System.out.println("应纳税额");
			System.out.println(t);
			
		}
	}
}