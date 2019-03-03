package ForDemo;

public class demoMAX {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i =0;i<10;i++){
			arr[i]=(int)(Math.random()*100);
			System.out.println(arr[i]);//先随机产生10个数
			
		}int max =arr[0];//假设max=arr[0];
		for(int i =1;i<10;i++){
			if(arr[i]>max){
				max=arr[i];
				System.out.println(arr[i]);//从随机产生的10个数里面
				
			}
			
		}
		System.out.println("最大值为："+max);
	}

}
