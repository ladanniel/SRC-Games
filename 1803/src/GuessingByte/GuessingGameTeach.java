package GuessingByte;
import java.util.Scanner;
//���ַ�С��Ϸ
public class GuessingGameTeach {
	
	//������
	public static void main(String[] args) {//���
		Scanner scan = new Scanner(System.in);
		char[] chs = generate(); //��ȡ����ַ�����
		System.out.println(chs); //����
		int count = 0; //�´�Ĵ���
		while(true){ //������ѭ�� ���þ���ֱ������ֹͣ�������
			System.out.println("�°�!");
			String str = scan.next().toUpperCase(); //�����û�������ַ�����ת��Ϊ��д��ĸ
			if(str.equals("EXIT")){
				System.out.println("�´�������!");
				break;
			}
			char[] input = str.toCharArray(); //���ַ���ת��Ϊ�ַ�����
			int[] result = check(chs,input); //�Ա�:����ַ��������û�������ַ�����
			if(result[0]==chs.length){ //��
				int score = 100*chs.length-10*count; //1���ַ�100�֣��´�һ�ο�10��
				System.out.println("��ϲ��¶��ˣ��÷�Ϊ:"+score);
				break;
			}else{ //��
				count++; //�´������1
				System.out.println("�ַ��Ը���Ϊ:"+result[1]+"��λ�öԸ���Ϊ:"+result[0]);
			}
		}
	}
	
	//��������ַ�����chs
	public static char[] generate(){//����Դ�洢
		char[] chs = new char[5]; //����ַ�����
		char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
				'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
				'W', 'X', 'Y', 'Z' }; //����ַ���Χ����
		boolean[] flags = new boolean[letters.length]; //��������
		for(int i=0;i<chs.length;i++){ //��������ַ�����
			int index;
			do{      //��26����ĸѭ��ɸѡһһ��Ӧλ�ò����
				index = (int)(Math.random()*letters.length); //����±�(0��25֮��)
			}while(flags[index]==true); //���±�index��Ӧ�Ŀ���Ϊtrueʱ����ʾ��Ӧ�ַ��Ѵ��������������index�±�
			                            //���±�index��Ӧ�Ŀ���Ϊfalseʱ����ʾ��Ӧ�ַ�δ�������ѭ������
			chs[i] = letters[index]; //�����±�index��letters�л�ȡ��Ӧ�ַ�������ֵ��chs�е�ÿһ��Ԫ��
			flags[index] = true; //���±�index��Ӧ�Ŀ����޸�Ϊtrue����ʾ��Ӧ�ַ��Ѵ��
		}
		//i=0 index=0        chs[0]='A' flags[0]=true
		//i=1 index=25       chs[1]='Z' flags[25]=true
		//i=2 index=0/25/0/1 chs[2]='B' flags[1]=true
		return chs;
	}
	
	//�Ա�:����ַ�����chs���û�������ַ�����input
	public static int[] check(char[] chs,char[] input){//�ȶԳ�ȡ����Դ
		int[] result = new int[2]; //�ԱȽ��������result[1]Ϊ�ַ��ԣ�result[0]Ϊλ�öԣ�Ĭ�϶�Ϊ0
		for(int i=0;i<chs.length;i++){ //��������ַ�����//�Աȹ����з�������ַ������ظ��������ӿ��ر����ظ�boolean֮�������
			for(int j=0;j<input.length;j++){ //�����û�������ַ�����
				if(chs[i]==input[j]){ //�ַ���
					result[1]++; //�ַ��Ը�����1
					if(i==j){ //λ�ö�
						result[0]++; //λ�öԸ�����1
					}
					break; //ʣ��input���ٲ���Ƚ���
				}
			}
		}
		return result;
	}
	
}
















