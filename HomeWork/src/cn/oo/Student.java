package cn.oo;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
	
	Student []stu;
	 String name ;
	String grade;
	int score;

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("������ѧ������");
		int num=scan.nextInt();
		Student[] st=new Student[num];
		for(int i=0;i<st.length;i++){
			st[i]=new Student();//�������뵽
			System.out.println("������ѧ������");
			st[i].name=scan.next();
			
			System.out.println("������ѧ������");
			st[i].score=scan.nextInt();
			
			System.out.println("������ѧ���༶");
			st[i].grade=scan.next();
			
		}
		int max=0;
		for (int m=0;m<st.length-1;m++){
			if(max<st[m].score){
				st[m].score=max;
				
			}System.out.println("��߷�Ϊ��"+max);
			
			
		}
		for(int i=0;i<st.length-1;i++){//ð������
			for(int j=0;j<st.length-1-i;i++){
				if(st[j].score<st[j+1].score){
					Student t=st[j];
					st[j]=st[j+1];
					st[j+1]=t;
					
				}
			}
			
			
		}
		for(int k=0;k<st.length-1;k++){
			System.out.println("������"+st[k].name+"������"+st[k].score+"�༶"+st[k].grade);
		}
			
			
		
		

		
	}

}
