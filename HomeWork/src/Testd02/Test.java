package Testd02;/**���Դ���*/

public class Test {
	Doctor1 doc;
	Student1 stu;
	Teacher1 tea;
	
	void Action(){//���Է���
		Person1[] ps=new Person1[9];
		ps[0]=new Doctor1("��ҽ��",45,"�Ͼ���·42��",2);
		ps[1]=new Doctor1("��ҽ��",45,"������·15��",3);
		ps[2]=new Doctor1("��ҽ��",45,"������·2��",3);
		ps[3]=new Teacher1("����ʦ",30,"�Ͼ���·42��",7500);
		ps[4]=new Teacher1("����ʦ",29,"������·15��",6500);
		ps[5]=new Teacher1("����ʦ",43,"������·2��",8000);
		ps[6]=new Student1("С��",15,"����·22��","xc0012");
		ps[7]=new Student1("С��",18,"����·18��","xc0124");
		ps[8]=new Student1("Сͯ",19,"����·11��","xc0321");
		for (int i = 0; i < ps.length; i++) {
			ps[i].sayHi();
			
			
			
		}
		
	
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.Action();
		
		

	}

}
