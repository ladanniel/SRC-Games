package cn.demorecoverday04;
/**英雄机设计第三天下午*/
import java.util.Random;

public class BigAirplane extends FlyingObject {
	
	int speed;
	/**构造法*/
	BigAirplane(){
		width=69;
		height=99;
		Random rand = new Random();
		x = rand.nextInt(400-this.width);        //x:0到（窗口宽-大敌机宽）之内的随机数，因为大敌机的位置是随机产生的，所以没有固定的坐标
		y = -this.height;                        //负的大敌机的高
		speed=2;
	}
	

}
