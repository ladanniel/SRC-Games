package guessinggame.recover;

import java.util.Random;
import java.util.Scanner;

public class GUESSING {
	public static int []check(char []chs,char[]input){
		//声明对比结果 比对chs和input
		int[]result  = new int[2];
		for (int i = 0; i < chs.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (chs[i]==input[j]) {
					result[0]++;
					if (i==j) {
						result[1]++;//字符对且位置对
					}
					break;
				}

			}

		}
		return result;//将比对的结果返回去
	}
	public static char [] action(){
		char [] arr = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J','K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V','W', 'X', 'Y', 'Z' };
		char []chs = new char[5];//准备需要比对的字符个数
		int index;//抽取字符串，必须要有中间变量把对应的字符串替换出来，以下标表示
		boolean []flag = new boolean[arr.length];//开关控制arr中所有的字符
		for (int i = 0; i < chs.length; i++) {
			Random rand = new Random();
			do {
				index = rand.nextInt(arr.length);//要想比对出来的没有重复，的先设置开关
			} while (flag[index]==true);
			chs[i]=arr[index];
			flag[index]=true;
		}

		return chs;//并将抽取出无重复的字符返回
	}
	public static void main(String[] args) {
		//用户输入，并调方法
		Scanner scan = new Scanner(System.in);
		char []chs = action();  //调至少执行一次的方法chs表示字符，当然chs去调响应的方法
		System.out.println(chs);
		int count=0;
		while (true) {
			System.out.println("猜吧！");
			String str = scan.next().toUpperCase();//申明接收用户输入的字符数字,并全部转换为大小写，便民
			while (str.length()!=5) {

				if ("EXIT".equals(str)) {//我不想猜了
					System.out.println("欢迎下次再来");
					break;   //避免在输入exit时候位数不够而导致的bug
				}
				System.out.println("输入错误，请重新输入：");
				str = scan.next().toUpperCase();

			}                                  //发现一个bug,字符可以无限制，所以必须添加限制
			if ("EXIT".equals(str)) {//我不想猜了 
				break;
			}
			char []input = str.toCharArray();//把用户输入的转换为数组
			int []result = check(chs,input);

			if (result[1]==chs.length) {
				int score = chs.length*100-10*count;
				System.out.println("恭喜你猜对了! 得分为："+score);
				break;
			}else{
				count++;
				System.out.println("字符对了"+result[0]+"位置对了"+result[1]);
			}

		}

	}

}

