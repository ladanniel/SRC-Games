package GuessingByte;
//���ַ���Ϸ
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		/*�����Լ����:char[]chs={'A','B','C','D','E'};
		char[]input={'A','C','X','M','R'};
		int[]result=check(chs,input);
		System.out.println(result[1]+","+result[0]);*/
		Scanner scan =new Scanner(System.in);
		char[]chs=generate();//��ȡ����ַ�����
	    System.out.println(chs);//����
	     int count=0;  //�´����
	    while(true){  //������ѭ��         ���3
	    	System.out.println("�°�");
	    	String str = scan.next().toUpperCase();//�����û������ַ�����ת���ɴ�д��ĸ��.toUpperCase(��д).toLowercase(Сд)��
	    	
	    	if( str.equals("EXIT")){//�û��������ˣ�����ת��֮ǰ�˳�
	    		System.out.println("�´�������");
	    		break;
	    		                   //�������������ж������==��String���������ж���Ȳ�����==,������str.equals();
	    	}
	    	char[]input =str.toCharArray();//���ַ���ת����char���飬
	    	
	    	int[]result =check(chs,input);//�Աȣ�������ɵ��ַ����û�������ַ�
	    	if(result[0]==chs.length){
	    		int score = 100*chs.length-10*count;
	    		System.out.println("��ϲ�㣬�¶��ˣ�"+","+"�÷�Ϊ��"+score);
	    		break;
	    	}else{
	    		count++;
				System.out.println("�ַ�����Ϊ��"+result[1]+"λ�ø���Ϊ��"+","+result[0]);
	    	}
	    }
	}
	public static char[] generate(){//���2       //��������ַ�����chs
		char[] chs = new char[5];//����ַ�����
		char[]letters={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		boolean [] flags = new boolean[letters.length];
		for(int i=0;i<chs.length;i++){//��������ַ�
			int index;
			do{
				 index=(int)(Math.random()*letters.length);
			}while(flags[index]==true);   //���±�index
			                              //���±�index
			chs[i]=letters[index];        //�����±�index��                      
			flags[index]=true;           //���±�index��Ӧ�Ŀ�����Ϊtrue,��ֹ�ظ���
			
			//int index=(int)(Math.random()*letters.length);���뵽do��
			chs[i]=letters[index];//�����±�index
		
			/*i=0   index=0  char[0]='A'
			 *i=0   index=1  char[1]='B'
			 *i=0   index=2  char[2]='C'
			 *i=0   index=3  char[3]='D'
			 *i=0   index=4  char[4]='E'
			 */
		}
		return chs;
	}
	public static int[] check(char[] chs,char[] input){//���1     //�Աȣ�����ַ�����chs���û���������input
		int []result=new int[2];
		for(int i=0;i<chs.length;i++){//�ַ�
			for(int j=0;j<input.length;j++){//λ��
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
