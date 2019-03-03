package cn.demorecoverDay08;
/**英雄机设计第五天上午*/
public class Sky extends FlyingObject{
	
	private int speed;
	private int y1;     
	/**构造法*/
	Sky(){
		super(400,700,0,0);
	
		speed = 1;
		y1 = -700;
	}//重写
	public void step(){   //public权限
		System.out.println("天空的y和y1坐标移动啦！"+speed);
	}
	//用于两张图片切换
	

}
