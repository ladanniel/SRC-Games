package Testd02;

public class Teacher1 extends Person1{
	
	double salary;
	Teacher1(String name,int age,String address,double salary){
		super(name,age,address);
		this.salary=salary;
		
		
	}void sayHi(){
		System.out.println("��Һã��ҽУ�"+name+"���꣺"+age+"����"+"��ͥסַΪ��"+address+",�ҵĹ���Ϊ��"+salary);
	}

}
