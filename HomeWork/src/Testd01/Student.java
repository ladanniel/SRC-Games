package Testd01;

import java.util.Random;

public class Student extends person  {
	
	
	int stuId;
	 Student(String name,int age,String address,int stuId){
		 super(name,age,address);
		 this.stuId=stuId;
		
		
		
		
		}public void sayHi(){
			
			System.out.println("��Һã��ҽ�:"+name+"����:"+age+"����"+"��ס:"+address+"ѧ��Ϊ��"+stuId);
	 
	

    }
}

	
	 
	
	


