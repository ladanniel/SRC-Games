package Guessing.Demo;
/*1.行和列对比并输出结果
 * 
 * 2建立数据
 * 
 * 3输出数据
 */
public class GuessingGame01 {

	public static void main(String[] args) {
		/*char[]chs={'A','B','C','D','E'};
		char[]input={'A','D','X','Z','F'};
		int[] result=check(chs,input);
		System.out.println(result[1]+","+result[0]);*/
		char[]chs=generate();
		System.out.println(chs);
		
		
		
		
		

	}


public static char[] generate(){
	char[]chs=new char[5];
	char[]letters={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	for(int i=0;i<chs.length;i++){
		int index =(int)(Math.random()*letters.length);
		chs[i]=letters[index];
		

		
	}
	
	
	return chs;
	
}
public static int[]check(char[]chs,char[]input){
	int[] result =new int[2];
	for(int i=0;i<chs.length;i++){
		for(int j=0;j<chs.length;j++){//行
			if(chs[i]==chs[j]){//列
				result[1]++;
				if(i==j){
					result[0]++;
					
				}
				
				
			}break;
			
		}
		
	}
	return result;
}
}