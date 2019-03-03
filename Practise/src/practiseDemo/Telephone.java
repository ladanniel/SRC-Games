package practiseDemo;
import java.util.Scanner;

public class Telephone {
	
	public static void main(String[] args) {
		double t = 0;
		double m=0.2;

		Scanner scan=new Scanner(System.in);
		System.out.println("请输入通话时间：");
		t=scan.nextDouble();
		if (t<=3) {
			m=0.2*3;
				System.out.println(m);
		}else if(t>3&&t<=10){
			m=0.2*3+(t-3)*0.1;
			System.out.println(m);
			
		}
		
		
	}

}
