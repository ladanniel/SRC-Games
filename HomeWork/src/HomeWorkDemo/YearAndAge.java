package HomeWorkDemo;

import java.util.Scanner;

public class YearAndAge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���������");
		int year = scan.nextInt();
		boolean flag = (year%4==0 && year%100!=0)||year%400==0;
		String str = flag?year+"������":year+"��ƽ��";
		System.out.println(str);
		
	}
}