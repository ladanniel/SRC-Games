package Testd02;

public class Student1 extends Person1 {
	
	String stuId;
	Student1(String name,int age,String address,String stuId){
		super(name,age,address);
		this.stuId=stuId;
		
		
		
		
	}void sayHi(){
		System.out.println("��Һã��ҽУ�"+name+"���꣺"+age+"����"+"��ͥסַΪ��"+address+",�ҵ�ѧ��Ϊ��"+stuId);
		
		
	}

}
