package Testd01;

import java.util.Random;

public class Teacher extends person {
	int salary;
	Teacher(String name,int age,String address,int salary){
		super(name,age,address);
		this.salary=salary;
		
		
	}public void sayHi(){
		
		System.out.println("��Һã��ҽ�:"+name+"����:"+age+"����"+"��ס:"+address+"����Ϊ:"+salary);
	}
}

