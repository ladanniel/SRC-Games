package Testd02;

public class Doctor1 extends Person1 {
	
	int level;
	Doctor1(String name,int age,String address,int level){
		super(name,age,address);
		this.level=level;
		
		
	}void sayHi(){
		System.out.println("大家好，我叫："+name+"今年："+age+"岁了"+"家庭住址为："+address+",我的医师级别为："+level);
	}

}
