package cn.demorecoverDay07;
/**英雄机设计第四天下午*/
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
		
		
		
	}//重写
	void step(){
		System.out.println("小蜜蜂的x坐标移动动啦！"+xSpeed+",小蜜蜂的x坐标移动动啦！"+ySpeed);
	}
	

}
