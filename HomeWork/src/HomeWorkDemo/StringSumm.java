package HomeWorkDemo;
//1+2+3+4+.....+100
public class StringSumm {
	public static void main(String[] args) {
		System.out.println(add(100));
		
		
		
	}
	public static long add(long n){
//	//�ݹ鷽��	
//		if (n==1) {
//			return 1;
//			
//		}
//		return add(n-1)+n;
//	}
		
//��Ŀ�ݹ鷽��
	return (n==1)?1:add(n-1)+n;
	
		
		    
		     
		

}
}
