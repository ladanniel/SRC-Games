package exercise;

import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
		double n = scan.nextDouble();
		if (n<0) {
			n=-1*n;
			
			
		}
		System.out.printf("%2f",n);
		System.out.println();
	}
	}
}
