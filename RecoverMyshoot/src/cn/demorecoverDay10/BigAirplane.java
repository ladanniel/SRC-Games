package cn.demorecoverDay10;
import java.awt.image.BufferedImage;
/**英雄机设计第六天上午*/
import java.util.Random;

public class BigAirplane extends FlyingObject {
	private static BufferedImage[] images;
	static{
		images=new BufferedImage[5];
		for (int i = 0; i < images.length; i++) {
			images[i]=loadImage("bigplane"+i+".png");
		}
	}
	
	private int speed;
	/**构造法*/
	BigAirplane(){
		super(69,99);
                      //负的大敌机的高
		speed=2;
	}
	//重写
	public void step(){                      //public权限
		System.out.println("大敌机的y坐标移动啦！"+speed);
	}

}
