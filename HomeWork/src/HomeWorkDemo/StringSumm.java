package HomeWorkDemo;
//1+2+3+4+.....+100
public class StringSumm {
	public static void main(String[] args) {
		System.out.println(add(100));
		
		
		
	}
	public static long add(long n){
//	//递归方法	
//		if (n==1) {
//			return 1;
//			
//		}
//		return add(n-1)+n;
//	}
		
//三目递归方法
	return (n==1)?1:add(n-1)+n;
	
		
		    
		     
		

}
}
