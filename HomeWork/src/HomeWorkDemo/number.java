package HomeWorkDemo;

import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);	
		System.out.println("请输入数字");
		int number =scan.nextInt();
		if(number%2==0){
			System.out.println(number+"是偶数");
			
			
		}else {
			System.out.println(number+"是奇数");
		}
			System.out.println("over");
		}

	}//上面的if、、、else、、、与以下内容原理十分相似
	/*Scanner scan = new Scanner(System.in);
	System.out.println("请输入年份");
	int year =scan.nextInt();
	boolean flag = (year%4==0 && year%100!=0)||year%400==0;
	String str = flag?year+"是闰年":year+"是平年";
	System.out.println(str);*/
