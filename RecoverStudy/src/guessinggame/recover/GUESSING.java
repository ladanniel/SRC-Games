package guessinggame.recover;

import java.util.Random;
import java.util.Scanner;

public class GUESSING {
	public static int []check(char []chs,char[]input){
		//�����ԱȽ�� �ȶ�chs��input
		int[]result  = new int[2];
		for (int i = 0; i < chs.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (chs[i]==input[j]) {
					result[0]++;
					if (i==j) {
						result[1]++;//�ַ�����λ�ö�
					}
					break;
				}

			}

		}
		return result;//���ȶԵĽ������ȥ
	}
	public static char [] action(){
		char [] arr = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J','K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V','W', 'X', 'Y', 'Z' };
		char []chs = new char[5];//׼����Ҫ�ȶԵ��ַ�����
		int index;//��ȡ�ַ���������Ҫ���м�����Ѷ�Ӧ���ַ����滻���������±��ʾ
		boolean []flag = new boolean[arr.length];//���ؿ���arr�����е��ַ�
		for (int i = 0; i < chs.length; i++) {
			Random rand = new Random();
			do {
				index = rand.nextInt(arr.length);//Ҫ��ȶԳ�����û���ظ����������ÿ���
			} while (flag[index]==true);
			chs[i]=arr[index];
			flag[index]=true;
		}

		return chs;//������ȡ�����ظ����ַ�����
	}
	public static void main(String[] args) {
		//�û����룬��������
		Scanner scan = new Scanner(System.in);
		char []chs = action();  //������ִ��һ�εķ���chs��ʾ�ַ�����Ȼchsȥ����Ӧ�ķ���
		System.out.println(chs);
		int count=0;
		while (true) {
			System.out.println("�°ɣ�");
			String str = scan.next().toUpperCase();//���������û�������ַ�����,��ȫ��ת��Ϊ��Сд������
			while (str.length()!=5) {

				if ("EXIT".equals(str)) {//�Ҳ������
					System.out.println("��ӭ�´�����");
					break;   //����������exitʱ��λ�����������µ�bug
				}
				System.out.println("����������������룺");
				str = scan.next().toUpperCase();

			}                                  //����һ��bug,�ַ����������ƣ����Ա����������
			if ("EXIT".equals(str)) {//�Ҳ������ 
				break;
			}
			char []input = str.toCharArray();//���û������ת��Ϊ����
			int []result = check(chs,input);

			if (result[1]==chs.length) {
				int score = chs.length*100-10*count;
				System.out.println("��ϲ��¶���! �÷�Ϊ��"+score);
				break;
			}else{
				count++;
				System.out.println("�ַ�����"+result[0]+"λ�ö���"+result[1]);
			}

		}

	}

}

