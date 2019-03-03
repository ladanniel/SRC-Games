package cn.demorecoverday04;
/**英雄机设计第三天下午*/
import java.util.Random;
public class Airplane extends FlyingObject{
	
	int speed;
	/**构造方法*/
	Airplane(){
		width = 49;
		height = 36;
		Random rand = new Random();
		x=rand.nextInt(400-this.width);      //x:0到（窗口宽-小敌机宽）之内的随机数，因为小敌机的坐标是随机产生的所以没有固定的x坐标
		y=-this.width;                       //负的小敌机的高
		speed=2;
	}

}
