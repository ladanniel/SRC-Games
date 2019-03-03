package ArrayDemo;

public class ArrayDemo {

	public static void main(String[] args) {
		/*int[] a = {10,20,30,40,50};
		int[] a1=new int[6];*/
	    /*a:源素组
	     *1：源数组的起始下标
	     *a1：目标数组
	     *0：目标数组的起始下标
	     *4：要复制的元素个数
	     */
		
		int[]a={10,20,30,40,50};
		int[]a1=new int[6];
		System.arraycopy(a, 0, a1, 1, 3);
		for(int i=0;i<a1.length;i++){
			System.out.println(a1[i]);
			
			
		
		
			
		}
			
	}
}
	


