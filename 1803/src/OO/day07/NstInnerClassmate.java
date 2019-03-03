package OO.day07;

public class NstInnerClassmate {

	public static void main(String[] args) {
		/*
		 * 创建了COO的一个派生类，但是没有名字
		 * 为该派生类创建了一个对象(只能创建一个对象)，名为o1
		 * 大括号中的为派生类的类体
		 * 
		 */
		
		
		Coo o1=new Coo(){//有隐式的抽象方法存在需要重写
			
		};
		Coo o2=new Coo(){};
		Doo o3 =new Doo(){
			void show(){
				System.out.println("showshow");
				
			}
			

			
		};
		o3.show();

	}

}
        abstract class Doo{
        	abstract void show();
        }

        
        abstract class Coo{
	
}
