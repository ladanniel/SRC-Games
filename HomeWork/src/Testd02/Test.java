package Testd02;/**测试窗口*/

public class Test {
	Doctor1 doc;
	Student1 stu;
	Teacher1 tea;
	
	void Action(){//测试方法
		Person1[] ps=new Person1[9];
		ps[0]=new Doctor1("赵医生",45,"南京西路42号",2);
		ps[1]=new Doctor1("李医生",45,"西安南路15号",3);
		ps[2]=new Doctor1("周医生",45,"北京东路2号",3);
		ps[3]=new Teacher1("赵老师",30,"南京西路42号",7500);
		ps[4]=new Teacher1("李老师",29,"西安南路15号",6500);
		ps[5]=new Teacher1("周老师",43,"北京东路2号",8000);
		ps[6]=new Student1("小明",15,"春熙路22号","xc0012");
		ps[7]=new Student1("小辉",18,"春熙路18号","xc0124");
		ps[8]=new Student1("小童",19,"人民路11号","xc0321");
		for (int i = 0; i < ps.length; i++) {
			ps[i].sayHi();
			
			
			
		}
		
	
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.Action();
		
		

	}

}
