package Testd02;

public class Doctor1 extends Person1 {
	
	int level;
	Doctor1(String name,int age,String address,int level){
		super(name,age,address);
		this.level=level;
		
		
	}void sayHi(){
		System.out.println("��Һã��ҽУ�"+name+"���꣺"+age+"����"+"��ͥסַΪ��"+address+",�ҵ�ҽʦ����Ϊ��"+level);
	}

}
