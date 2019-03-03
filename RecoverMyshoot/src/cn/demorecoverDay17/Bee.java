package cn.demorecoverDay17;
/**英雄机设计第十一天*/
import java.awt.image.BufferedImage;
import java.util.Random;



public class Bee extends FlyingObject implements Award{
	private static BufferedImage [] images;
	static{
		images=new BufferedImage[2];
		for (int i = 0; i < images.length; i++) {
			images[i]=loadImage("bee"+i+".png");
		}
	}
	private int xSpeed;
	private int ySpeed;
	private int awardType;                                                                 //奖励类型
	/**构造法*/
	public Bee(){
		super(60,50);
		Random rand =new Random();
		xSpeed=1;
		ySpeed=2;
		awardType=rand.nextInt(2);                                                      //两种奖励类型，括号中就写2，想有几种奖励就写几
		
		
		
	}//重写
	public void step(){                                                               //public权限
		x+=xSpeed;                                                                     // x+可能向左，也可能向右
		y+=ySpeed;                                                                    //小蜜蜂移动xy坐标都发生变化
		if (x<=0||x>=World.WIDTH-this.width) {
			xSpeed*=-1;                                                                 //x=-1时；-1*-1=1向右改变方向;x=1时1*-1=-1，向左改变方向
		}
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
	public int getAwardType(){
		return awardType;
	}
	
	

}
