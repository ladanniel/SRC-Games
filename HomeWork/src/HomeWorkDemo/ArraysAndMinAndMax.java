package HomeWorkDemo;
//�κ���ҵ��
import java.util.Arrays;

public class ArraysAndMinAndMax {

	public static void main(String[] args) {
		int []arr=new int[10];
		int[] m = new int[11];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*100);

		}System.out.println("�����е�����Ϊ:");
		System.out.println(arr[arr.length-9]+","+arr[arr.length-8]+","+arr[arr.length-7]+","
				+arr[arr.length-6]+","+arr[arr.length-7]+","+arr[arr.length-6]+","+arr[arr.length-5]
				+","+arr[arr.length-4]+","+arr[arr.length-3]+","+arr[arr.length-2]+","+arr[arr.length-1]);
		
		System.out.println("===============");
		
		int min=arr[0];
		for(int j=0;j<arr.length-1;j++){
			if(min>arr[j]){
				min=arr[j];	
			}
		}
			System.out.println("��СֵΪ��");
			System.out.println(min);
			
			System.out.println("============");
	        System.arraycopy(arr, 0, m, 1, 10);
	        min=m[0];
			System.out.println("�µ�����Ϊ");
			for(int k=0;k<m.length-1;k++){
				
			}
			System.out.println(m[m.length-9]+","+m[m.length-8]+","+m[m.length-7]+","
					+m[m.length-6]+","+m[m.length-7]+","+m[m.length-6]+","+m[m.length-5]
					+","+m[m.length-4]+","+m[m.length-3]+","+m[m.length-2]+","+m[m.length-1]);
					
		}

	}


