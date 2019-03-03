package Testd01;

import java.util.Random;

public class Student extends person  {
	
	
	int stuId;
	 Student(String name,int age,String address,int stuId){
		 super(name,age,address);
		 this.stuId=stuId;
		
		
		
		
		}public void sayHi(){
			
			System.out.println("大家好，我叫:"+name+"今年:"+age+"岁了"+"家住:"+address+"学号为："+stuId);
	 
	

    }
}

	
	 
	
	


