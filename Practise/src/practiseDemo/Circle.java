package practiseDemo;



public class Circle {
	
	private double radius;
	
	Circle(){
			radius=0.0; 
	}
	Circle(double r){
		radius=r;
	}
	double getPerimeter(){
		return 2*Math.PI*radius;
	}
	double getArea(){
		return Math.PI*radius*radius;
	}
	void show(){
		System.out.println("Բ�İ뾶Ϊ��"+radius);
		System.out.println("Բ���ܳ�Ϊ��"+getPerimeter());
		System.out.println("Բ�����Ϊ��"+getArea());
	}
	
	public static void main(String[] args) {
		
		
				
				
			
			
		
		
	}

}
