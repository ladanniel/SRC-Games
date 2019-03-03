package HomeWorkDemo;
import java.util.Scanner;
public class num001 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输出三个数字");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int  t;	//位置替换变量
		if(a>b){
			t=a;
			a=b;
			b=t;
	
		}else if(a>c){
			t=a;
			a=c;
			c=t;
		}else if(b>c){
			t=b;
			b=c;
			c=t;
	}
        System.out.println("a="+a+"b="+b+"c="+c);
	}
}
