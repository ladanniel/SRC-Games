package cn.demorecoverDay15;
/**英雄机设计第九天上午*/
import java.awt.image.BufferedImage;
import java.util.Random;
/**小敌机既是继承，又是实现得分*/
public class BigAirplane extends FlyingObject implements Enemy {
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
/**重写检测飞行物是否越界*/
	public boolean outOfBounds(){
		return this.y>=World.HEIGHT;                                      //小敌机大于等于窗口的高即为越界了
	}
	public int getScore(){
		return 3;                                                          //打掉大敌机得3分
	}

}
