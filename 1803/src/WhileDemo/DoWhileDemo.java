package WhileDemo;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num = (int)(Math.random()*1000);//1000���ڵ������
		System.out.println(num);
		
		
		int guess;//������ѭ�����ı�ϳ�һ����1-3��ͬ
		do{
			System.out.println("�°ɣ�");
		    guess =scan.nextInt();
		    if(guess==0){
				break;
				
			}
			if(guess>num){
				System.out.println("̫����");
			}else if(guess<num){
				System.out.println("̫С��");
			}				
			
			
		}while(guess!=num);//2
				if(guess==num){
					System.out.println("��ϲ�㣡�¶��ˣ�");
				}else{
					System.out.println("��ӭ�´�������");

				}

				}
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Scanner scan = new Scanner(System.in);
		int num =250;
		System.out.println("�°ɣ�");
		int guess =scan.nextInt();
		while(guess!=num){
			
			if(guess==0){
				break;
				
			}
			if(guess>num){
				System.out.println("̫����");
			}else{
				System.out.println("̫С��");
			}				
			System.out.println("�°ɣ�");
			guess=scan.nextInt();
			
			
			//���guessing003�д��ڵ�����
		}
	if(guess==num){
		System.out.println("��ϲ�㣡�¶��ˣ�");
	}else{
		System.out.println("��ӭ�´�������");*/

	}

	


