package practiseDemo;

	import java.util.Scanner;
	public class telephone1 
	{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("������i:");
	int i=sc.nextInt();
	        System.out.println("ͨ��ʱ��Ϊ:"+i+"��");
	double w=0.0;
	if (i>=0.0&&i<=180.0)
	{
	w=0.2*i/60;
	}else if ((i-180)==0)
	{
	w=0.6+(i-180)/60*0.1;
	}else
	{
	w=0.6+((i-180)/60+1)*0.1;
	}
	System.out.println("�����շѽ��Ϊ:"+w+"Ԫ");
	}
	}
