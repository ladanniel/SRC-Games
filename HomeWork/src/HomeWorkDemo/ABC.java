package HomeWorkDemo;

import java.util.Scanner;

public class ABC {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�������������");
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
        System.out.println("a="+a+"b="+b+"c="+c);
	}
	


	}
/*int a = 5 ,b= 8 ,c = 10;

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
}*///������д��������


