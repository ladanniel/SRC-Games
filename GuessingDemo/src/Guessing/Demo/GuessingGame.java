package Guessing.Demo;

import java.util.Scanner;

/*1.�к��жԱȲ�������
 * 
 * 2��������
 * 
 * 3�������
 */
public class GuessingGame {

	public static void main(String[] args) {
		/*char[]chs={'A','B','C','D','E'};
		char[]input={'A','D','X','Z','F'};
		int[] result=check(chs,input);
		System.out.println(result[1]+","+result[0]);*///Сë���������Ѳ����Ŵ�λ��
		Scanner scan=new Scanner(System.in);
		char[]chs=generate();
		System.out.println(chs);
		int count=0;
		while(true){
			System.out.println("�°�");
			String str=scan.next().toUpperCase();
			char[]input=str.toCharArray();
			int[] result=check(chs,input);
			if(result[0]==chs.length){
				 int score=chs.length*100-10*count;
				
				System.out.println("��ϲ�㣬�¶��ˣ��÷�Ϊ"+score);
				break;
				
			}else{
				count++;
				System.out.println("�ַ�����Ϊ��"+result[1]+"λ�ø���Ϊ��"+","+result[0]);
				
			}
			
			
		}
	
	}


public static char[] generate(){
	char[]chs=new char[5];
	char[]letters={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	boolean[]flags=new boolean[letters.length];//ע�⿪�ص�λ�ñ����for������
	for(int i=0;i<chs.length;i++){
		int index;
		do{
			index =(int)(Math.random()*letters.length);

		}while(flags[index]==true);
		chs[i]=letters[index];
		flags[index]=true;
	}
	return chs;
}
public static int[]check(char[]chs,char[]input){
	int[] result =new int[2];
	for(int i=0;i<chs.length;i++){
		for(int j=0;j<input.length;j++){//��
			if(chs[i]==input[j]){//��
				result[1]++;
				if(i==j){
					result[0]++;
					
				}
				break;
				
				
			}
			
		}
		
	}
	return result;
}
}