package ForDemo;

public class demoMAX {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i =0;i<10;i++){
			arr[i]=(int)(Math.random()*100);
			System.out.println(arr[i]);//���������10����
			
		}int max =arr[0];//����max=arr[0];
		for(int i =1;i<10;i++){
			if(arr[i]>max){
				max=arr[i];
				System.out.println(arr[i]);//�����������10��������
				
			}
			
		}
		System.out.println("���ֵΪ��"+max);
	}

}
