package GuessingByte;

import java.util.Random;
import java.util.Scanner;

public class Guessing {
	public static void main(String[] args) {
//		char[]chs={'A','B','C','D','E'};
//		char[]input={'A','D','S','C','F'};
//		int[]result=check(chs,input);
//		System.out.println(result[0]+","+result[1]);
		Scanner scan = new Scanner(System.in);
		char[]chs=generage();
		System.out.println(chs);
		int count=0;
		while (true) {
			System.out.println("猜吧");
			String str = scan.next().toUpperCase();
			
			if ("EXIT".equals(str)) {
				System.out.println("欢迎下次再来");
				break;
			}
			char[]input=str.toCharArray();
			int []result = check(chs,input);
			System.out.println(result);
			if (result[0]==chs.length) {
				
				int Score = 100*chs.length-10*count;
				System.out.println("恭喜你，猜对了"+","+"得分为："+Score);
				
			}else {
				count++;
				System.out.println("字符个数为"+result[1]+","+"位置个数为"+result[0]);
				
			}
		
			
		}

		
	}
	
	
	
	
	public static char[] generage(){
		char[] chs = new char[5];
		char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
				'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		Random rand = new Random();
		boolean []flag = new boolean[letters.length];
		for (int i = 0; i < chs.length; i++) {
			int index;
			do {
				index=rand.nextInt(letters.length);
				
				
			} while (flag[index]==true);
			chs[i]=letters[index];
			flag[index]=true;
		}
		
		
		return chs;
		
		
		}
		
		
	

	
	
	
	public static int [] check(char[] chs ,char[] input){
		int [] result = new int [2];
		for (int i = 0; i < chs.length; i++) {
			for (int j = 0; j < result.length; j++) {
				if (chs[i]==input[j]) {
					result[1]++;
					if(i==j) {
					result[0]++;
				}
					break;
				}
				
			}
			
		}

		return result;
		
	}
	
	
	
	
	
}