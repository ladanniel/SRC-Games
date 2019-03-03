package cn.demorecoverday03;
/**英雄机设计第三天*/
import java.util.Random;

public class BigAirplane {
	int width;
	int height;
	int x;
	int y;
	int speed;
	
	BigAirplane(){
		width=69;
		height=99;
		Random rand = new Random();
		x = rand.nextInt(400-this.width);        //x:0到（窗口宽-大敌机宽）之内的随机数，因为大敌机的位置是随机产生的，所以没有固定的坐标
		y = -this.height;                        //负的大敌机的高
		speed=2;
	}
	void step(){
		System.out.println("大敌机的y坐标移动啦！"+speed);
	}

}
