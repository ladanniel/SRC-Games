package ForDemo;

public class SumDemo {

	public static void main(String[] args) {
		int sum = 0;//3
		for(int num=1;num<=100;num++){//����˼·1
			sum=sum+num;//4  sum+=num  sum*=num(�۳�)
			
		}
		System.out.println("sum="+sum);//2
		/*           sum=0    �ۼƼ�
		 * num=1     sum=1+0
		 * num=2     sum=1+2
		 * num=3     sum=1+2+3
		 * num=4     sum=1+2+3+4
		 * ...........
		 * num=100   sum=1+2+3+4+......+100\
		 * num=101  ����Ϊ�٣�ѭ������
		 */
		
	}

}
