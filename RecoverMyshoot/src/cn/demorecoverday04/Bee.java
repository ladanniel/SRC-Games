package cn.demorecoverday04;
/**英雄机设计第三天下午*/
import java.util.Random;

public class Bee extends FlyingObject{
	int xSpeed;
	int ySpeed;
	int awardType;//奖励类型
	/**构造法*/
	Bee(){
		width=60;
		height=50;
		Random rand =new Random();
		x=rand.nextInt(400-this.width);
		y=-this.height;
		xSpeed=1;
		ySpeed=2;
		awardType=rand.nextInt(2);//两种奖励类型，括号中就写2，想有几种奖励就写几
		
		
		
	}
	

}
