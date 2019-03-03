package HomeWorkDemo;
 import java.util.Scanner;
public class ninthDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("显示商品单价");
		double price = scan.nextInt();
		System.out.println(price);
	
		System.out.println("购买数量");
		double PurchaseNumeber = scan.nextDouble();
		System.out.println(PurchaseNumeber);
		
		System.out.println("收款金额");
		double gathering = scan.nextDouble();
		System.out.println(gathering);
		
		double c;
		c=price*PurchaseNumeber;
		if(c>=500){
			c*=0.8;//打八折
		
			
			
		}
	
		if(gathering>=c){
			double change =gathering-c;
			
			System.out.println("总价为"+c+"找零");
			
		}else {
			System.out.println("error!您的钱不够，还差"+(gathering-c));
		}
		double change = gathering-c;
		System.out.println("总价为"+c+"找零"+change);
		
		
		
	}

}
