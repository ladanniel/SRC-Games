package guessinggame.recover;

import java.util.Random;
import java.util.Scanner;




public class GuessingGame {//�ȶԷ���
	public static int[]check(char[]chs,char[]input){
		int []result = new int[2];
		for (int i = 0; i < chs.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (chs[i]==input[j]) {
					result[0]++;
					if (i==j) {
						result[1]++;//�ַ��Բ����±�Ҳ��
					}
					break;
				}
				
			}
			
		}
		return result;
	}
	public static char []action(){//�ȶ��ַ�
		char [] arr = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J','K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V','W', 'X', 'Y', 'Z' };
		char []chs = new char[5];
		int index;
		boolean [] flag = new boolean[arr.length];
		for (int i = 0; i < chs.length; i++) {
		     Random rand = new Random();
		     do{
		     index = rand.nextInt(arr.length);
		     }while(flag[index]==true);
		     chs[i]=arr[index];
		     flag[index]=true;
		}
		return chs;
		
	}
	public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
		char []chs = action();
		System.out.println(chs);
		int count=0;
		while(true){
			System.out.println("�°ɣ�");
			
			String str = scan.next().toUpperCase();
            while(str.length()!=5){
				System.out.println("��ʽ��������������");
				str = scan.next().toUpperCase();
			}
			
			if ("OK".equals(str)) {
				System.out.println("������");
				continue;
			}
			if ("EXIT".equals(str)) {
				break;
			}
			char[]input=str.toCharArray();
			int []result = check(chs,input);
			if(result[1]==chs.length){
				int score = chs.length*100 -10*count;
				System.out.println("��ϲ��¶���"+score);
				break;
				
			}else{
				count++;
				System.out.println("�ַ��ԣ�"+result[0]+"λ�öԣ�"+result[1]);
			}
		}
		
		
		
	}
	

}
