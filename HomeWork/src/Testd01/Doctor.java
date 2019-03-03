package Testd01;

public class Doctor extends person {
	
	int level;
	 Doctor(String name,int age,String address,int level ){
		 super(name,age,address);
		 this.level=level;
		 
	 
	
	}public void sayHi(){
		
		System.out.println("大家好，我叫:"+name+"今年:"+age+"岁了"+"家住:"+address+"医师级别为"+level);
	}
		
	}
	



