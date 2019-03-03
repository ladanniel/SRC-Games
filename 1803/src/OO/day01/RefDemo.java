package OO.day01;

public class RefDemo {

	public static void main(String[] args) {
		Student stu1 = new Student();
		Student stu2=stu1;
		stu1.age=25;
		stu2.age=28;
		System.out.println(stu1.age);
		int a =5;
		int b=a;
		a=8;
		b=88;
		System.out.println(a);
	}

}
