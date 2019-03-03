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
		System.out.println("请输入学生个数");
		int num=scan.nextInt();
		Student[] st=new Student[num];
		for(int i=0;i<st.length;i++){
			st[i]=new Student();//不容易想到
			System.out.println("请输入学生姓名");
			st[i].name=scan.next();
			
			System.out.println("请输入学生分数");
			st[i].score=scan.nextInt();
			
			System.out.println("请输入学生班级");
			st[i].grade=scan.next();
			
		}
		int max=0;
		for (int m=0;m<st.length-1;m++){
			if(max<st[m].score){
				st[m].score=max;
				
			}System.out.println("最高分为："+max);
			
			
		}
		for(int i=0;i<st.length-1;i++){//冒泡排序
			for(int j=0;j<st.length-1-i;i++){
				if(st[j].score<st[j+1].score){
					Student t=st[j];
					st[j]=st[j+1];
					st[j+1]=t;
					
				}
			}
			
			
		}
		for(int k=0;k<st.length-1;k++){
			System.out.println("姓名："+st[k].name+"分数："+st[k].score+"班级"+st[k].grade);
		}
			
			
		
		

		
	}

}
