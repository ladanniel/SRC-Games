package cn.demorecoverDay11;
/**英雄机设计第六天下午*/
import java.awt.image.BufferedImage;
import java.util.Random;

public class Bee extends FlyingObject{
	private static BufferedImage [] images;
	static{
		images=new BufferedImage[2];
		for (int i = 0; i < images.length; i++) {
			images[i]=loadImage("bee"+i+".png");
		}
	}
	private int xSpeed;
	private int ySpeed;
	private int awardType;//奖励类型
	/**构造法*/
	Bee(){
		super(60,50);
		Random rand =new Random();
		xSpeed=1;
		ySpeed=2;
		awardType=rand.nextInt(2);//两种奖励类型，括号中就写2，想有几种奖励就写几
		
		
		
	}//重写
	public void step(){           //public权限
		System.out.println("小蜜蜂的x坐标移动动啦！"+xSpeed+",小蜜蜂的x坐标移动动啦！"+ySpeed);
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
