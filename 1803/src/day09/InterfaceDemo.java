package day09;
/**�ӿڵ���ʾ*/
public class InterfaceDemo {

	public static void main(String[] args) {
		//Inter4 o1 =new Inter4();
		Inter4 o2 =new Eoo();
		Inter3 o3 =new Eoo();
		 Aoo s=new Aoo();
		
		 
		

	
	
	}
	/**�ӿڵ��﷨*/
	interface Inetr1{
		public static final double pi=3.14;
		public abstract void show();
		int m=5;
		void say();
	}
/**�ӿڵ�ʵ��*/
}
/**�ӿڵĶ�ʵ��*/

  interface Inter1{
	  double pi=3.5;
	  void show();
  }
  interface Inter2{
	 public void a();
	  public void b();
	  
  }
  class Aoo implements Inter2{
	  Aoo(){
		  System.out.println("javascring����");
	  }
	  public void a(){
		  System.out.println("javaxxxxxx");
	  }
	  public void b(){}
  }
  interface Inter3{
	public void  c();
	  

  }
 
  abstract class Coo{
	  abstract void d();
	  
  }
 abstract class Doo extends Coo implements Inter2,Inter3{
	 abstract public  void d();
	 public void a(){
		 System.out.println("d�̳�3");
	 }
	  public void b(){
		  System.out.println("˫�̳�");
	  }
	
	  
  }
  interface Inter4 extends Inter3{
	  public void e();
	  

  }
   class Eoo implements Inter4{
	   public void  c(){
		   
		   System.out.println("ʵ��cz");
	   }
		  public void e(){
			  System.out.println("ʵ��e");
		  }
  }
  

/**�ӿڼ̳нӿ�*/