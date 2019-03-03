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
		System.out.println("圆的半径为："+radius);
		System.out.println("圆的周长为："+getPerimeter());
		System.out.println("圆的面积为："+getArea());
	}
	
	public static void main(String[] args) {
		
		
				
				
			
			
		
		
	}

}
