package ArrayDemo;

import java.util.Arrays;

//冒泡排序
public class BuubleSortDemo {

	public static void main(String[] args) {
		
		int[]arr=new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*100);
			System.out.print(arr[i]+" ");	//将arr中的10个数随机取出，范围并在100以内
			
		}
		
		for(int i=0;i<arr.length-1;i++){//控制轮数
			for(int j=0;j<arr.length-1-i;j++){//控制次数
				if(arr[j]>arr[j+1]){//每次都和它下一个元素比较
					int t=arr[j];//进行数据排序
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		System.out.println("冒泡排序");
		for(int k=0;k<arr.length-1;k++){
			System.out.print(arr[k]+" ");
		
		
		
		
	}		
	}
}
			
		
	

	

