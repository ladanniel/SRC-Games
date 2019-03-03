package Testd01;
public class person {/**提取参数的仓库，所有变量的属性的共同点都放在此处*/
	String name;
	int age ;
	String address;
	
	person(String name,int age,String address){
		this.name=name;
		this.age=age;
		this.address=address;
		
		
		
	}void sayHi(){
		
		System.out.println("大家好，我叫:"+name+"今年:"+age+"岁了"+"家住:"+address);
	
		
	}

}
