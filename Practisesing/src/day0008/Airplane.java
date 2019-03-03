package day0008;
/**英雄机设计第八天下午*/
import java.awt.image.BufferedImage;

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
/**重写step（）移动**/	                                                                       
	public void step(){                                                    //public权限
		y+=speed;                                                           //y向下移动
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
			return img;                                                     //将状态修改为删除状态
		}
			return null;
	}
/**重写检测飞行物是否越界*/
	public boolean outOfBounds(){
		return this.y>=World.HEIGHT;                                      //小敌机大于等于窗口的高即为越界了
	}
}
