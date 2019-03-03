package cn.demorecoverDay10;
import java.awt.image.BufferedImage;
/**英雄机设计第六天上午*/
import java.util.Random;
public class Airplane extends FlyingObject{
	private static BufferedImage[] images;
	static{
		images=new BufferedImage[5];
		for (int i = 0; i < images.length; i++) {
			images[i]=loadImage("airplane"+i+".png");
		}
		
	}
	 private int speed;
	/**构造方法*/
	Airplane(){
		super(49,36);
		speed=2;
	}
	//重写
	public void step(){     //public权限
		System.out.println("小敌机的y坐标移动啦！"+speed);
	}

}
