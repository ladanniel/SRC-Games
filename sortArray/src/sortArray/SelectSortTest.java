package sortArray;

public class SelectSortTest {
	//选择排序
	public static void SelectSort(int []arr){
		int a=0;
		int b=0;
		for (int i = 0; i < arr.length; i++) {//寻找最小的元素循环层
			a = arr[i];
			b=i;
			for (int j = i+1; j < arr.length; j++) {//逐个数被选出的循环层
				if (arr[j]<a) {
					a=arr[j];
					b=j;
				}
			}
			if (b!=i) {//下标，————指向下标对应的值，只用下标比较
				arr[b]=arr[i];
				arr[i]=a;//将a[i+1]到a[6]中最大值与a[i]交换
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
