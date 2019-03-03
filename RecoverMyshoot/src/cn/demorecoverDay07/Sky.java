package cn.demorecoverDay07;
/**英雄机设计第四天下午*/
public class Sky extends FlyingObject{
	
	int speed;
	int y1;     
	/**构造法*/
	Sky(){
		super(400,700,0,0);
	
		speed = 1;
		y1 = -700;
	}//重写
	void step(){
		System.out.println("天空的y和y1坐标移动啦！"+speed);
	}
	//用于两张图片切换
	

}
