package OO.day02;
//���취����
public class Student {

	
	String name;
	int age;
	String address;
	Student(String name ){
		this(name,0,null);
		
	}
	Student(String name,int age){
		this(name, age, name);
		
	}
	Student(String name,int age,String address){
		   this.name =name;
		   this.age=age;
		   this.address=address;
		   
	}  void SayHi(){
			   System.out.println("����"+name+"����"+age+"��ͥסַ"+address);   
		   }
	   }
	
    
  
   

