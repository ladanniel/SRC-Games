package ArrayDemo;
/**构造法*/
import java.util.Scanner;

public class MethodDemo {

	public static void main(String[] args) {
		say();
		sayHi("wangwu");
		double x =getnum();
		System.out.println(x);
		int m =plus(15,100);
		System.out.println(m);
		a();
		
}
	public static void say(){
		System.out.println("hellowrold");
		
	}
	public static void sayHi(String name){
		System.out.println("名字叫："+name);
		
	}
	public static double getnum(){
		return 88.99;
	}
	public static int plus(int num1,int num2){
		return num1+num2;	
	}
	public static void a(){
		b();
		int a=110;
		System.out.println(a);
	}
	public static void b(){
		int b=120;
		c();
		System.out.println(b);	
	}
	public static void c(){
		int c=112;
		System.out.println(c);
	}
}


