package GuessingByte;
//猜字符游戏
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		/*可行性检测用:char[]chs={'A','B','C','D','E'};
		char[]input={'A','C','X','M','R'};
		int[]result=check(chs,input);
		System.out.println(result[1]+","+result[0]);*/
		Scanner scan =new Scanner(System.in);
		char[]chs=generate();//获取随机字符数组
	    System.out.println(chs);//作弊
	     int count=0;  //猜错次数
	    while(true){  //自造死循环         框架3
	    	System.out.println("猜吧");
	    	String str = scan.next().toUpperCase();//接收用户输入字符串并转换成大写字母（.toUpperCase(大写).toLowercase(小写)）
	    	
	    	if( str.equals("EXIT")){//用户不想玩了，则在转换之前退出
	    		System.out.println("下次再来吧");
	    		break;
	    		                   //基本类型数据判断相等用==，String类型数据判断相等不能用==,而是用str.equals();
	    	}
	    	char[]input =str.toCharArray();//将字符串转换成char数组，
	    	
	    	int[]result =check(chs,input);//对比：随机生成的字符与用户输入的字符
	    	if(result[0]==chs.length){
	    		int score = 100*chs.length-10*count;
	    		System.out.println("恭喜你，猜对了！"+","+"得分为："+score);
	    		break;
	    	}else{
	    		count++;
				System.out.println("字符个数为："+result[1]+"位置个数为："+","+result[0]);
	    	}
	    }
	}
	public static char[] generate(){//框架2       //生成随机字符数组chs
		char[] chs = new char[5];//随机字符数组
		char[]letters={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		boolean [] flags = new boolean[letters.length];
		for(int i=0;i<chs.length;i++){//遍历随机字符
			int index;
			do{
				 index=(int)(Math.random()*letters.length);
			}while(flags[index]==true);   //当下标index
			                              //当下标index
			chs[i]=letters[index];        //基于下标index到                      
			flags[index]=true;           //将下标index对应的开关设为true,防止重复，
			
			//int index=(int)(Math.random()*letters.length);放入到do中
			chs[i]=letters[index];//基于下标index
		
			/*i=0   index=0  char[0]='A'
			 *i=0   index=1  char[1]='B'
			 *i=0   index=2  char[2]='C'
			 *i=0   index=3  char[3]='D'
			 *i=0   index=4  char[4]='E'
			 */
		}
		return chs;
	}
	public static int[] check(char[] chs,char[] input){//框架1     //对比：随机字符数组chs与用户输入数组input
		int []result=new int[2];
		for(int i=0;i<chs.length;i++){//字符
			for(int j=0;j<input.length;j++){//位置
				if(chs[i]==input[j]){
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
