package ArrayDemo;

import java.util.Arrays;

//ð������
public class BuubleSortDemo {

	public static void main(String[] args) {
		
		int[]arr=new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*100);
			System.out.print(arr[i]+" ");	//��arr�е�10�������ȡ������Χ����100����
			
		}
		
		for(int i=0;i<arr.length-1;i++){//��������
			for(int j=0;j<arr.length-1-i;j++){//���ƴ���
				if(arr[j]>arr[j+1]){//ÿ�ζ�������һ��Ԫ�رȽ�
					int t=arr[j];//������������
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		System.out.println("ð������");
		for(int k=0;k<arr.length-1;k++){
			System.out.print(arr[k]+" ");
		
		
		
		
	}		
	}
}
			
		
	

	

