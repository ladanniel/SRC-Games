package HomeWorkDemo;

import java.util.Scanner;

public class maxdemo {//三个数从小到大排列

	public static void main(String[] args) {
		
		int a = 5 ,b= 8 ,c = 10;
		
		int  t;	
		if(a>b){
			t=a;
			a=b;
			b=t;
	
		}
		if(a>c){
			t=a;
			a=c;
			c=t;
		}
		if(b>c){
			t=b;
			b=c;
			c=t;
	}
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
	}
		
		//这两种写法都可以
		
		
		
		
		
		
		/*Scanner scan = new Scanner(System.in);
		System.out.println("请输出三个数字,分别以空格隔开");//int t=a,先把a的值存储
	
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int  t;	
		if(a>b){
			t=a;
			a=b;
			b=t;
	
		}
		if(a>c){
			t=a;
			a=c;
			c=t;
		}
		if(b>c){
			t=b;
			b=c;
			c=t;
	}
        System.out.println("a="+a+"b="+b+"c="+c);*/
	}


