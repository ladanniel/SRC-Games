package OO.day07;

public class NstInnerClassmate {

	public static void main(String[] args) {
		/*
		 * ������COO��һ�������࣬����û������
		 * Ϊ�������ഴ����һ������(ֻ�ܴ���һ������)����Ϊo1
		 * �������е�Ϊ�����������
		 * 
		 */
		
		
		Coo o1=new Coo(){//����ʽ�ĳ��󷽷�������Ҫ��д
			
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
