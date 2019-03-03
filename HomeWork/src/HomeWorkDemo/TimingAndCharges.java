package HomeWorkDemo;

import java.util.Scanner;

public class TimingAndCharges {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("通话记录：");
		
		double times;
		double charges1=0;
		double charges2=0;
		times=scan.nextDouble();
		for(double i=0;i<=3;i++){
				charges1=times*0.2;
			}System.out.println("通话时间为:"+times+"min"+","+"话费为:"+charges1+"RMB");
	
	   for(double j=3;3<j&&j<=10;j++){
				charges2=times*0.2+times*0.1;	
				System.out.println("通话时间为:"+times+"min"+","+"话费为:"+charges2+"RMB");
			
			}for(double k=0;0<k&&k<1;k++){
				continue;
			
		}
			}
			}


