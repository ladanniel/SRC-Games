package Guessing.Demo;

import java.util.Scanner;

/*1.行和列对比并输出结果
 * 
 * 2建立数据
 * 
 * 3输出数据
 */
public class GuessingGame {

	public static void main(String[] args) {
		/*char[]chs={'A','B','C','D','E'};
		char[]input={'A','D','X','Z','F'};
		int[] result=check(chs,input);
		System.out.println(result[1]+","+result[0]);*///小毛病，经常把参数放错位置
		Scanner scan=new Scanner(System.in);
		char[]chs=generate();
		System.out.println(chs);
		int count=0;
		while(true){
			System.out.println("猜吧");
			String str=scan.next().toUpperCase();
			char[]input=str.toCharArray();
			int[] result=check(chs,input);
			if(result[0]==chs.length){
				 int score=chs.length*100-10*count;
				
				System.out.println("恭喜你，猜对了！得分为"+score);
				break;
				
			}else{
				count++;
				System.out.println("字符个数为："+result[1]+"位置个数为："+","+result[0]);
				
			}
			
			
		}
	
	}


public static char[] generate(){
	char[]chs=new char[5];
	char[]letters={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	boolean[]flags=new boolean[letters.length];//注意开关的位置别放在for里面了
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
		for(int j=0;j<input.length;j++){//行
			if(chs[i]==input[j]){//列
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