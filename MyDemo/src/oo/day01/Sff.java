package oo.day01;

public class Sff {

	public static void main(String[] args) {
		Student[] stus = new Student[3];
		stus[0] = new Student("aaa",25,"LF","111");
		stus[1] = new Student("bbb",21,"JMS","222");
		stus[2] = new Student("ccc",26,"LF","333");
		for(int i=0;i<stus.length;i++){
			stus[i].sayHi();
		}
		
		Teacher[] tes = new Teacher[3];
		tes[0] = new Teacher("ddd",55,"LF",5000);
		tes[1] = new Teacher("eee",31,"SD",7000);
		tes[2] = new Teacher("fff",36,"SD",8000);
		for(int i=0;i<tes.length;i++){
			tes[i].sayHi();
		}
		
		Doctor[] ds = new Doctor[2];
		ds[0] = new Doctor("ggg",25,"LF","主治医师");
		ds[1] = new Doctor("hhh",31,"JMS","主任医师");
		for(int i=0;i<ds.length;i++){
			ds[i].sayHi();
		}
	}
}

class Person{
	String name;
	int age;
	String address;
	Person(String name,int age,String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	void sayHi(){
		System.out.println("大家好，我叫"+name+"，今年"+age+"岁了，家住"+address);
	}
}
class Student extends Person{
	String stuId;
	Student(String name,int age,String address,String stuId){
		super(name,age,address);
		this.stuId = stuId;
	}
}
class Teacher extends Person{
	double salary;
	Teacher(String name,int age,String address,double salary){
		super(name,age,address);
		this.salary = salary;
	}
}
class Doctor extends Person{
	String level;
	Doctor(String name,int age,String address,String level){
		super(name,age,address);
		this.level = level;
}

}
