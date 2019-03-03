package cn.demorecoverday03;
/**英雄机设计第三天*/
import java.util.Random;

public class Bee {
	int width;
	int height;
	int x;
	int y;
	int xSpeed;
	int ySpeed;
	int awardType;//奖励类型
	
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
	void step(){
		System.out.println("小蜜蜂的x坐标啦！"+xSpeed+",小蜜蜂的y坐标移动啦"+ySpeed);
	}

}
