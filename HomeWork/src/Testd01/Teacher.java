package Testd01;

import java.util.Random;

public class Teacher extends person {
	int salary;
	Teacher(String name,int age,String address,int salary){
		super(name,age,address);
		this.salary=salary;
		
		
	}public void sayHi(){
		
		System.out.println("大家好，我叫:"+name+"今年:"+age+"岁了"+"家住:"+address+"工资为:"+salary);
	}
}

