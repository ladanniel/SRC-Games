package practiseDemo;



public class water {
	public static void main(String[] args) {
		int p=3;
		int g=3;
		int m=3;
		while(p>=2||g>=3){
			if(p>=2){
			int t=p/2;
			m=m+t;
			p=p-t*2+t;
			g=g+t;
			
		}
		if (g>=3) {
			int x=g/3;
			m=m+x;
			g=g-x*3+x	;
			p=p+x;
			
		}
		}
		System.out.println(m);
		
		
		
		
		 
	}

}
