package ScoreLeavel;
  import java.util.Scanner;
  
public class Command {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("����������");
		int command = scan.nextInt();//nextInt�������������
		if(command==1){
			System.out.println("��ʾȫ����¼");
		}else if(command==2){
			System.out.println("��ѯ��¼��¼");
		}else if(command==0){
			System.out.println("��ӭ�´�����");
			
		}else{
			System.out.println("�������");
		}
			//����switch ....case �﷨�ģ�if.....else if �﷨�����ã���֮��һ��
		/*switch(command){
		case 1:
			System.out.println("��ʾȫ����¼");
			break;
		case 2:
			System.out.println("��ѯ��¼��¼");
			break;
		case 0:
			System.out.println("��ӭ�´�����");
			break;
		default :
			System.out.println("�������");*/
		}

	}


