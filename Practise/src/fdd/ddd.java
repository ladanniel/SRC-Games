package fdd;
import java.util.Scanner;
public class ddd 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("�����������:");
double lichen = sc.nextDouble();
System.out.print("������ȴ�ʱ��:");
int time = sc.nextInt();
double money=0.0;
        if (lichen<=3.0)
        {
money = 10;
        }else if (lichen > 3.0 && lichen <= 15.0)
        {
money = 10 + (lichen - 3.0) * 2;
        }else {
money = (10 + (lichen - 3.0) * 2) * 1.5;
}
if (time > 150)
{
money = money + time/150;
}
System.out.println("��Ӧ�����:"+(int)money+"Ԫ");
}
}