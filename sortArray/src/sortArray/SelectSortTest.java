package sortArray;

public class SelectSortTest {
	//ѡ������
	public static void SelectSort(int []arr){
		int a=0;
		int b=0;
		for (int i = 0; i < arr.length; i++) {//Ѱ����С��Ԫ��ѭ����
			a = arr[i];
			b=i;
			for (int j = i+1; j < arr.length; j++) {//�������ѡ����ѭ����
				if (arr[j]<a) {
					a=arr[j];
					b=j;
				}
			}
			if (b!=i) {//�±꣬��������ָ���±��Ӧ��ֵ��ֻ���±�Ƚ�
				arr[b]=arr[i];
				arr[i]=a;//��a[i+1]��a[6]�����ֵ��a[i]����
			}
			
		}
		
	}
	public static void main(String[] args) {
		
		int []arr ={8,5,6,12,58,62};
		SelectSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}
	}

}
