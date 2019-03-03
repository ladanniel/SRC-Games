package Testd02;

public class Teacher1 extends Person1{
	
	double salary;
	Teacher1(String name,int age,String address,double salary){
		super(name,age,address);
		this.salary=salary;
		
		
	}void sayHi(){
		System.out.println("大家好，我叫："+name+"今年："+age+"岁了"+"家庭住址为："+address+",我的工资为："+salary);
	}

}
