
import java.util.Scanner;

public class Student {
	String name;
	int score;
	String address;

	 Student(String name, int score, String address) {
		this.name = name;
		this.score = score;
		this.address = address;
 
		
	}
		

	void sayHi() {
		System.out.println("����" + name + "," + "����Ϊ��" + score + "," + "�༶" + address);

	}
	

	public static void main(String[] args) {
		
		Student[] st = new Student[10];
		st[0] = new Student("aaa", 154, "������1����");
		st[1] = new Student("bbb", 148, "������2����");
		st[2] = new Student("ccc", 160, "�߶���1����");
		st[3] = new Student("ddd", 149, "��һ��3����");
		st[4] = new Student("eee", 158, "�߶���2����");
		st[5] = new Student("fff", 152, "������3����");
		st[6] = new Student("hhh", 166, "��һ��3����");
		st[7] = new Student("iii", 180, "������5����");
		st[8] = new Student("hhh", 175, "�߶���4����");
		st[9] = new Student("jjj", 185, "������5����");
		
		
		for(int i=0;i<st.length-1;i++){
			for(int j=0;j<st.length-1-i;j++){
				if(st[j].score>st[j+1].score){
					Student t = st[j];
					st[j]=st[j+1];
					st[j+1]=t;
				}
			
			}	
					
		}
		Student max=st[0];
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i].name+st[i].score+st[i].address);
			
			
		}
	
				
		
			
		
	}

}
