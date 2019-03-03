package cn.demorecoverDay10;

import java.awt.image.BufferedImage;

/**英雄机设计第六天上午*/
public class Sky extends FlyingObject{
	private static BufferedImage image;
	static{
		image=loadImage("background.png");
	}
	private int speed;
	private int y1;     
	/**构造法*/
	Sky(){
		super(World.WIDTH,World.HEIGHT,0,0);
	
		speed = 1;
		y1 = -this.height;
	}//重写
	public void step(){   //public权限
		System.out.println("天空的y和y1坐标移动啦！"+speed);
	}
	//用于两张图片切换
	

}
