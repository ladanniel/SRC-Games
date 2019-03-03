package cn.demorecoverDay05;
/**英雄机设计第三天下午super*/
import java.util.Random;

public class Bee extends FlyingObject{
	int xSpeed;
	int ySpeed;
	int awardType;//奖励类型
	/**构造法*/
	Bee(){
		super(60,50);
		Random rand =new Random();
		xSpeed=1;
		ySpeed=2;
		awardType=rand.nextInt(2);//两种奖励类型，括号中就写2，想有几种奖励就写几
		
		
		
	}
	

}
