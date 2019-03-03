package ArrayDemo;

import java.util.Random;

public class Buuble {

	public static void main(String[] args) {
		int []arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			Random rand = new Random();
			arr[i]=rand.nextInt(100);
			System.out.print(arr[i]+" ");
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[i]==arr[j]) {
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
					
				}
			}
			}
		System.out.print("ц╟ещеепР");
			
			for (int j = 0; j < arr.length-1; j++) {
				System.out.print(arr[j]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int []arr=new int[10];
//		for(int i=0;i<arr.length;i++){
//			Random rand = new Random();
//			arr[i]=rand.nextInt(100);
//			System.out.print(arr[i]+" ");
//			
//		}for(int i=0;i<arr.length-1;i++){
//			for(int j=0;j<arr.length-1-i;j++){
//				if(arr[j]>arr[j+1]){
//					int t;
//					t=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=t;
//					
//				}
//				
//			}
//			
//		}System.out.println("ц╟ещеепР");
//		for(int i=0;i<arr.length-1;i++){
//			System.out.print(arr[i]+" ");
//			
//			
//		}
		

	}

}
