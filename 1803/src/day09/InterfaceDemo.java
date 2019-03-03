package day09;
/**接口的演示*/
public class InterfaceDemo {

	public static void main(String[] args) {
		//Inter4 o1 =new Inter4();
		Inter4 o2 =new Eoo();
		Inter3 o3 =new Eoo();
		 Aoo s=new Aoo();
		
		 
		

	
	
	}
	/**接口的语法*/
	interface Inetr1{
		public static final double pi=3.14;
		public abstract void show();
		int m=5;
		void say();
	}
/**接口的实现*/
}
/**接口的多实现*/

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
		  System.out.println("javascring整合");
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
		 System.out.println("d继承3");
	 }
	  public void b(){
		  System.out.println("双继承");
	  }
	
	  
  }
  interface Inter4 extends Inter3{
	  public void e();
	  

  }
   class Eoo implements Inter4{
	   public void  c(){
		   
		   System.out.println("实现cz");
	   }
		  public void e(){
			  System.out.println("实现e");
		  }
  }
  

/**接口继承接口*/