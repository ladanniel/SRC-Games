package HomeWorkDemo;
 import java.util.Scanner;
public class ninthDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("��ʾ��Ʒ����");
		double price = scan.nextInt();
		System.out.println(price);
	
		System.out.println("��������");
		double PurchaseNumeber = scan.nextDouble();
		System.out.println(PurchaseNumeber);
		
		System.out.println("�տ���");
		double gathering = scan.nextDouble();
		System.out.println(gathering);
		
		double c;
		c=price*PurchaseNumeber;
		if(c>=500){
			c*=0.8;//�����
		
			
			
		}
	
		if(gathering>=c){
			double change =gathering-c;
			
			System.out.println("�ܼ�Ϊ"+c+"����");
			
		}else {
			System.out.println("error!����Ǯ����������"+(gathering-c));
		}
		double change = gathering-c;
		System.out.println("�ܼ�Ϊ"+c+"����"+change);
		
		
		
	}

}
