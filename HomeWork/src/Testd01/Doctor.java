package Testd01;

public class Doctor extends person {
	
	int level;
	 Doctor(String name,int age,String address,int level ){
		 super(name,age,address);
		 this.level=level;
		 
	 
	
	}public void sayHi(){
		
		System.out.println("��Һã��ҽ�:"+name+"����:"+age+"����"+"��ס:"+address+"ҽʦ����Ϊ"+level);
	}
		
	}
	



