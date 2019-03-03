package ArrayDemo;
//找最大值
import java.util.Arrays;
public class MaxofArray {

	public static void main(String[] args) {
		int [] arr =new int[10];
		
		for(int i = 0;i<arr.length-1;i++){
			arr[i]=(int)(Math.random()*100);
			System.out.println(arr[i]);
		}
		
		int max =arr[0];
		for(int i=1;i<arr.length-1;i++){
			
			if(arr[i]>max){
				max=arr[i];
				System.out.println(arr[i]);	
			}	
		}
		System.out.println("最大值为"+max);	
		arr=Arrays.copyOf(arr, arr.length-1);
		arr[arr.length-1]=max;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++){

			System.out.println(arr[i]);
		}System.out.println("最大值为："+max);		
	}
}



