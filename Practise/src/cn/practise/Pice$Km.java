package cn.practise;

import java.util.Scanner;

public class Pice$Km {
	public static void main(String[] args) {
		double km;
		double price=10;//Ӧ�ս��
		double wt;
		
		
		Scanner scan =new Scanner(System.in);
		System.out.println("������˳����");
		km=scan.nextDouble();
		System.out.println("������ȴ�ʱ��");
		wt=scan.nextDouble();
		 
		 if (km<=3) {
			 System.out.println(price);	 
		} 
		 else if(km<=15){
			 price=10+(km-3)*2+1/2.5*wt;
			 System.out.println(price);	 
	    }else{
	    
	    		price=10+(km-3)*2+1/2.5*wt;
			 System.out.println(price/2+price);
	    	
	    }
		
		
		

	}

}

