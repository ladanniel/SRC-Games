package Testd02;

public class Student1 extends Person1 {
	
	String stuId;
	Student1(String name,int age,String address,String stuId){
		super(name,age,address);
		this.stuId=stuId;
		
		
		
		
	}void sayHi(){
		System.out.println("大家好，我叫："+name+"今年："+age+"岁了"+"家庭住址为："+address+",我的学号为："+stuId);
		
		
	}

}
