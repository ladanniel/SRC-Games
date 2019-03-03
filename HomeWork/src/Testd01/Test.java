package Testd01;

public class Test {
	Doctor[] d;
	Student []s;
	Teacher []t;
	void person(){
		person [] ps =new person[8];
		ps[0]=new Doctor("aaa",25,"jms",2);
		ps[1]=new Doctor("bbb",25,"nanjing" ,3);
		ps[2]=new Teacher("eee",25,"langfang",5000);
		ps[3]=new Teacher("fff",25,"hainan",7000);
		ps[4]=new Student("iii",15,"guiyang",112);
		ps[5]=new Student("jjj",15,"fujian",123);
		ps[6]=new Teacher("ggg",25,"tianjin",115);
		ps[7]=new Doctor("ddd",25,"xuzhou",5);
		for(int i=0;i<ps.length;i++){
			ps[i].sayHi();
			
		}
		//重写方法并调用时，看对象的类型
		person p1=new Student("kkkk",25,"jms",112 );
		Student p2 =new Student("aaa",25,"jms" ,115);
		p1.sayHi();//调用Student的类
		p2.sayHi();//调用Student的类
		
		}
		
		
		
	
	

	public static void main(String[] args) {
		Test co=new Test();
		co.person();
		

	}

}
