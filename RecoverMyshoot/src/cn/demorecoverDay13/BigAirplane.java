package cn.demorecoverDay13;
/**英雄机设计第八天*/
import java.awt.image.BufferedImage;
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
		y+=speed;                               //y向下移动
	}
	int deadIndex=1;
	/**重写获取图片*/
	public BufferedImage getImage(){
		if(isLife()){
			
			return images[0];
		}else if(isDead()){
			BufferedImage img = images[deadIndex++];
			if (deadIndex==images.length) {
				state=REMOVE;
				
			}
			return img; //将状态修改为删除状态
		}
			return null;
	}

}
