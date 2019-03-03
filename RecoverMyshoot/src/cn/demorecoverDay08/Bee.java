package cn.demorecoverDay08;
/**英雄机设计第五天上午*/
import java.util.Random;

public class Bee extends FlyingObject{
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
	

}
