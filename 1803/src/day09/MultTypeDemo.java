package day09;
//∂‡Ã¨—› æ
public class MultTypeDemo {

	public static void main(String[] args) {
		Moo o = new Noo();
		Noo o1 =(Noo)o;
		Inter8 o2 = (Inter8)o;
		//Poo o3=(Poo)o;
		if (o instanceof Poo) {
			Poo o4 = (Poo)o;
			
		}
		
	}

}
interface Inter8{
	
}
class Moo{

	}

class Noo extends Moo implements Inter8{
	

	
	
}
class Poo extends Moo{
	
}